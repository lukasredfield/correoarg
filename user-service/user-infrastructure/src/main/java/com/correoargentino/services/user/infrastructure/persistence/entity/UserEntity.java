package com.correoargentino.services.user.infrastructure.persistence.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "users")
public class UserEntity {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private UUID id;

  @Column(name = "name", nullable = true)
  private String name;

  @Column(name = "lastname", nullable = true)
  private String lastname;

  @Column(name = "mail_address", nullable = true)
  private String mailAddress;

  @Column(name = "password", nullable = true)
  private String password;

  @Column(name = "phone_number", nullable = true)
  private String phoneNumber;

  @Column(name = "created_at", nullable = true)
  private LocalDateTime createdAt;

  @Column(name = "updated_at", nullable = true)
  private LocalDateTime updatedAt;
}
