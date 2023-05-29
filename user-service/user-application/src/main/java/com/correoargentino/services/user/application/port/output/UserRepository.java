package com.correoargentino.services.user.application.port.output;

import com.correoargentino.services.user.application.exception.UserNotFoundException;
import com.correoargentino.services.user.domain.model.User;
import java.util.UUID;

public interface UserRepository {
  User find(UUID id) throws UserNotFoundException;

  void create(User user);

  void save(User user);
}
