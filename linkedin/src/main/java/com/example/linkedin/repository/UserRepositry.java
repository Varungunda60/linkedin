package com.example.linkedin.repository;

import com.example.linkedin.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositry extends JpaRepository<User,Long> {
}
