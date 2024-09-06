package com.javamaster.repository;

import com.javamaster.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserEntityRepository extends JpaRepository<UserEntity, Integer> {

    UserEntity findByEmail(String email);


}
