package com.example.linkedin.repository;

import com.example.linkedin.entity.Experience;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExperienceRepositry extends JpaRepository<Experience,Long> {
}
