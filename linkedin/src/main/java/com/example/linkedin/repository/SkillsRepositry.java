package com.example.linkedin.repository;

import com.example.linkedin.entity.Skills;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillsRepositry extends JpaRepository<Skills,Long> {
}
