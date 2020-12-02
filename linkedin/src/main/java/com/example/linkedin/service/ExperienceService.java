package com.example.linkedin.service;

import com.example.linkedin.entity.Company;
import com.example.linkedin.entity.Experience;
import com.example.linkedin.entity.User;
import com.example.linkedin.model.WebExperience;
import com.example.linkedin.repository.CompanyRepositry;
import com.example.linkedin.repository.ExperienceRepositry;
import com.example.linkedin.repository.UserRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienceService {

    @Autowired
    private ExperienceRepositry experienceRepositry;
    @Autowired
    private UserRepositry userRepositry;

    @Autowired
    private CompanyService companyService;

    public void saveExperience(Long id, WebExperience webExperience){
        User user= userRepositry.findById(id).get();
        Experience experience = new Experience();
        experience.setUser(user);
        experience.setTitle(webExperience.getTitle());
        experience.setStartDate(webExperience.getStartDate());
        experience.setEndDate(webExperience.getEndDate());
        experience.setHeadline(webExperience.getHeadline());
        experience.setEmploymentType(webExperience.getEmploymentType());
        experience.setStartDate(webExperience.getStartDate());
        experience.setCompany(companyService.saveCompany(webExperience.getWebCompany()));
        experienceRepositry.save(experience);

    }
}
