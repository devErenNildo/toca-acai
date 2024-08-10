package com.toca_acai.repositories;

import com.toca_acai.domain.user.UserClient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserClient, Long> {
}
