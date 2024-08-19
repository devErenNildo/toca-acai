package com.toca_acai.repositories;

import com.toca_acai.domain.user.Roles;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Roles, Long> {
}
