package com.github.member.repository;

import com.github.member.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {

    Boolean existsByemail(String email);

    Optional<UserEntity> findByEmail(String email);

    UserEntity findByemail(String email);
}
