package com.codepractice.userservice.repository;

import com.codepractice.userservice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
    User save(User user);

    User findByUserId(Long userId);
}
