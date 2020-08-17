package com.thanhnb.authservice.repository;

import com.thanhnb.authservice.model.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRoleRepository extends JpaRepository<UserRole, Long> {
}
