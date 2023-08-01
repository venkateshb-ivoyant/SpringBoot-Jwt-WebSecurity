package com.ivoyant.SpringSecurityjwt.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ivoyant.SpringSecurityjwt.entity.ERole;
import com.ivoyant.SpringSecurityjwt.entity.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
