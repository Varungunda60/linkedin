package com.example.linkedin.service;

import com.example.linkedin.entity.Company;
import com.example.linkedin.entity.Experience;
import com.example.linkedin.model.WebCompany;
import com.example.linkedin.repository.CompanyRepository;
import com.example.linkedin.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CompanyService {

    @Autowired
    private CompanyRepository companyRepository;
    @Autowired
    private UserRepository userRepository;

    public Company saveCompany(@org.jetbrains.annotations.NotNull WebCompany webCompany) {
        Company company = new Company();
        company.setIndustryType(webCompany.getIndustryType());
        company.setLocation(webCompany.getLocation());
        company.setName(webCompany.getName());
        companyRepository.save(company);
        return company;
    }

    public List<Company> getAllCompanies(Long id) {
        List<Company> companies = new ArrayList<>();
        if (userRepository.findById(id).isPresent()) {
            for (Experience experience : userRepository.findById(id).get().getExperience()) {
                companies.add(experience.getCompany());
            }
            return companies;
        }
        return null;
    }
}
