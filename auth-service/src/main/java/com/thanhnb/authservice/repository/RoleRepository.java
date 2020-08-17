package com.thanhnb.authservice.repository;

import com.thanhnb.authservice.model.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoleRepository extends JpaRepository<RoleEntity, Long> {

    @Query(value = "SELECT * FROM user_role ur WHERE ur.USER_ID = :id", nativeQuery = true)
    List<RoleEntity> findAllByUserId(Long id);
}
