package com.example.linkedin.service;

import com.example.linkedin.entity.Company;
import com.example.linkedin.entity.Education;
import com.example.linkedin.entity.Experience;
import com.example.linkedin.model.WebCompany;
import com.example.linkedin.model.WebExperience;
import com.example.linkedin.repository.CompanyRepositry;
import com.example.linkedin.repository.UserRepositry;
import lombok.Lombok;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CompanyService {

    @Autowired
    private CompanyRepositry companyRepositry;
    @Autowired
    private UserRepositry userRepositry;

    public Company saveCompany(@org.jetbrains.annotations.NotNull WebCompany webCompany){
        Company company=new Company();
        company.setIndustryType(webCompany.getIndustryType());
        company.setLocation(webCompany.getLocation());
        company.setName(webCompany.getName());
        companyRepositry.save(company);
        return company;
    }
    public List<Company> getAllCompanies(Long id){
        List<Company> companies=new ArrayList<Company>();
        for(Experience experience: userRepositry.findById(id).get().getExperience()){
            companies.add(experience.getCompany());
        }
        return companies;
    }
}
