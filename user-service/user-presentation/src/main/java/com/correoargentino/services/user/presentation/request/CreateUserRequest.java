package com.correoargentino.services.user.presentation.request;

import java.time.LocalDateTime;

public record CreateUserRequest(
        String name,
        String lastname,
        String mailAddress,
        String password,
        String phoneNumber,
        LocalDateTime createdAt,
        LocalDateTime updatedAt) {
}

