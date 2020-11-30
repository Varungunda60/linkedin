package com.example.linkedin.repository;

import com.example.linkedin.entity.Education;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EducationRepositry extends JpaRepository<Education,Long> {
}
