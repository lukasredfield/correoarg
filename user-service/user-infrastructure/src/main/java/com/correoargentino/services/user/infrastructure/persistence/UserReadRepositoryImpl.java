package com.correoargentino.services.user.infrastructure.persistence;

import com.correoargentino.services.user.application.port.output.UserReadRepository;
import com.correoargentino.services.user.application.query.model.User;
import java.util.Optional;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserReadRepositoryImpl implements UserReadRepository {
  private final JdbcTemplate jdbcTemplate;
  @Override
  public Optional<User> findById(UUID id) {
    try {
      var sql = "SELECT * FROM users u WHERE u.id = ?";
      var result = jdbcTemplate.queryForObject(sql,
          (rs, r) -> new User(UUID.fromString(rs.getString("id"))), id);

      return  Optional.ofNullable(result);
    } catch (Exception e) {
      return Optional.empty();
    }
  }

  /**
   * Método para prueba
   * @return
   */
  @Override
  public Optional<User> findAllUser() {
    try {
      var sql = "SELECT * FROM users";
      var result = jdbcTemplate.query(sql, (rs, rowNum) ->
              new User(
                      UUID.fromString(rs.getString("id")))
      );

      if (result.isEmpty()) {
        return Optional.empty();
      }

      // Aquí puedes decidir cómo manejar el caso de múltiples usuarios encontrados.
      // Puedes devolver una lista de usuarios o simplemente devolver el primer usuario encontrado.

      return Optional.of(result.get(0)); // Devuelve el primer usuario encontrado

      // O bien, devuelve la lista completa de usuarios encontrados
      // return Optional.of(result);

    } catch (Exception e) {
      return Optional.empty();
    }
  }


}
