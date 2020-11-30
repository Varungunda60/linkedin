package com.example.linkedin.repository;

import com.example.linkedin.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepositry extends JpaRepository<Company,Long> {
}
