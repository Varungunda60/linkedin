package com.example.linkedin.repository;

import com.example.linkedin.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CompanyRepositry extends JpaRepository<Company,Long> {
//    List<Company> findbylocation(String location);
}
