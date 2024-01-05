package com.meetandcraft.api.user;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface UserRepository extends JpaRepository<UserEntity, UUID> {
    Optional<UserEntity> findAllByUsername(String username);
    Boolean existsByUsername(String username);
}
