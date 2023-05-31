package com.correoargentino.services.user.infrastructure.persistence;

import com.correoargentino.services.user.application.exception.UserNotFoundException;
import com.correoargentino.services.user.application.port.output.UserRepository;
import com.correoargentino.services.user.domain.model.User;
import com.correoargentino.services.user.infrastructure.persistence.entity.UserEntity;
import com.correoargentino.services.user.infrastructure.persistence.mapper.imp.UserMapperImp;
import com.correoargentino.services.user.infrastructure.persistence.repository.UserEntityRepository;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserRepositoryImp implements UserRepository {
  private final UserEntityRepository userEntityRepository;
  private final UserMapperImp userMapperImp;

  @Override
  public User find(UUID id) {
    return userEntityRepository.findById(id)
        .map(userMapperImp::toAggregate)
        .orElseThrow(() -> new UserNotFoundException(id));
  }

  /**
   * Creates a new user.
   *
   * @param user The user object to be created.
   */

  @Override
  public void create(User user) {
    UserEntity userEntity = userMapperImp.fromAggregate(user);
    userEntityRepository.save(userEntity);
  }


  @Override
  public void save(User user) {
    userEntityRepository.save(userMapperImp.fromAggregate(user));
  }
}
