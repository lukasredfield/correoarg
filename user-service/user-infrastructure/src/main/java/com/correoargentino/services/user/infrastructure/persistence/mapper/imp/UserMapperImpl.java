package com.correoargentino.services.user.infrastructure.persistence.mapper.imp;

import com.correoargentino.services.user.domain.primitive.AggregateRoot;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class UserMapperImpl extends AggregateRoot {

    private UUID id;
    private String name;
    private String lastname;
    private String mailAddress;
    private String password;
    private String phoneNumber;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

}