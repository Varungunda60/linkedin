package com.example.linkedin.service;

import com.example.linkedin.entity.Company;
import com.example.linkedin.entity.Experience;
import com.example.linkedin.entity.User;
import com.example.linkedin.model.WebExperience;
import com.example.linkedin.repository.CompanyRepository;
import com.example.linkedin.repository.ExperienceRepository;
import com.example.linkedin.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienceService {

    @Autowired
    private ExperienceRepository experienceRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private CompanyRepository companyRepository;

    @Autowired
    private CompanyService companyService;

    public void saveExperience(Long id, WebExperience webExperience) {
        if (userRepository.findById(id).isPresent()) {
            User user = userRepository.findById(id).get();
            Experience experience = new Experience();
            experience.setUser(user);
            experience.setTitle(webExperience.getTitle());
            experience.setStartDate(webExperience.getStartDate());
            experience.setEndDate(webExperience.getEndDate());
            experience.setHeadline(webExperience.getHeadline());
            experience.setEmploymentType(webExperience.getEmploymentType());
            experience.setStartDate(webExperience.getStartDate());
            experience.setCompany(companyService.saveCompany(webExperience.getWebCompany()));
            experienceRepository.save(experience);

        }

    }

    public void deleteExperience(Long id) {
        experienceRepository.deleteById(id);
    }

    public void updateExperience(Long experienceId, WebExperience webExperience) {
            if (experienceRepository.findById(experienceId).isPresent()) {
                Experience experience = experienceRepository.findById(experienceId).get();
                experience.setTitle(webExperience.getTitle());
                experience.setStartDate(webExperience.getStartDate());
                experience.setEndDate(webExperience.getEndDate());
                experience.setHeadline(webExperience.getHeadline());
                experience.setEmploymentType(webExperience.getEmploymentType());
                experience.setStartDate(webExperience.getStartDate());
                Company company = experience.getCompany();
                company.setIndustryType(webExperience.getWebCompany().getIndustryType());
                company.setLocation(webExperience.getWebCompany().getLocation());
                company.setName(webExperience.getWebCompany().getName());
                companyRepository.save(company);
                experienceRepository.save(experience);
            }
        }

}
