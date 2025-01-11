package com.jt.securenotes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.jt.securenotes.models.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByUserName(String username);

    Boolean existsByUserName(String username);
    Boolean existsByEmail(String email);

    Optional<User> findByEmail(String email);
}
