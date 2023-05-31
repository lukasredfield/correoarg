package com.correoargentino.services.user.application.command;

import com.correoargentino.services.user.application.messaging.Command;

import java.time.LocalDateTime;
import java.util.UUID;

public record CreateUserCommand(UUID id, String name, String lastname, String mailAddress, String password, String phoneNumber, LocalDateTime createdAt, LocalDateTime updatedAt) implements Command<UUID> {
    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getMailAddress() {
        return mailAddress;
    }

    public String getPassword() {
        return password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }
}
