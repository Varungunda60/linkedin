package com.example.linkedin.repository;

import com.example.linkedin.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CompanyRepository extends JpaRepository<Company,Long> {
}
