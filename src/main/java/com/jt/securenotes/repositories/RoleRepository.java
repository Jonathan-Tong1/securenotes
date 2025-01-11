package com.jt.securenotes.repositories;

import com.jt.securenotes.models.AppRole;
import com.jt.securenotes.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {

    Optional<Role> findByRoleName (AppRole appRole);
}
