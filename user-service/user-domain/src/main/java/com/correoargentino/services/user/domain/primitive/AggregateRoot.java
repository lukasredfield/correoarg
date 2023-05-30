package com.correoargentino.services.user.domain.primitive;

import lombok.Data;

import java.util.UUID;

@Data
public abstract class AggregateRoot extends Entity<UUID> {
  protected AggregateRoot(UUID id) {
    super(id);
  }

  protected AggregateRoot() {
    this(null);
  }
}
