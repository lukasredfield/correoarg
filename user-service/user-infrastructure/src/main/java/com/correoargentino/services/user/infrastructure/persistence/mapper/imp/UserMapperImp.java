package com.correoargentino.services.user.infrastructure.persistence.mapper.imp;

import com.correoargentino.services.user.domain.model.User;
import com.correoargentino.services.user.infrastructure.persistence.entity.UserEntity;
import com.correoargentino.services.user.infrastructure.persistence.mapper.UserMapper;
import org.springframework.stereotype.Component;

@Component
public class UserMapperImp implements UserMapper {

    @Override
    public UserEntity fromAggregate(User user) {
        UserEntity userEntity = new UserEntity();
        userEntity.setId(user.getId());
        userEntity.setName(user.getName());
        userEntity.setLastname(user.getLastname());
        userEntity.setMailAddress(user.getMailAddress());
        userEntity.setPassword(user.getPassword());
        userEntity.setPhoneNumber(user.getPhoneNumber());
        userEntity.setCreatedAt(user.getCreatedAt());
        userEntity.setUpdatedAt(user.getUpdatedAt());
        return userEntity;
    }

    @Override
    public User toAggregate(UserEntity userEntity) {
        User user = new User(
                userEntity.getId(),
                userEntity.getName(),
                userEntity.getLastname(),
                userEntity.getMailAddress(),
                userEntity.getPassword(),
                userEntity.getPhoneNumber(),
                userEntity.getCreatedAt(),
                userEntity.getUpdatedAt()
        );
        return user;
    }
}
