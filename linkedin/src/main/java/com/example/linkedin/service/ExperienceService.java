package com.example.linkedin.service;

import com.example.linkedin.entity.Experience;
import com.example.linkedin.entity.User;
import com.example.linkedin.model.WebExperince;
import com.example.linkedin.repository.ExperienceRepositry;
import com.example.linkedin.repository.UserRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Access;
@Service
public class ExperienceService {

    @Autowired
    private ExperienceRepositry experienceRepositry;
    @Autowired
    private UserRepositry userRepositry;

    public void addExperience(Long id, WebExperince webExperince){
        User user= userRepositry.findById(id).get();
        Experience experience=new Experience();
        experience.setCompany(webExperince.getCompany());
        experience.setEmploymentType(webExperince.getEmploymentType());
        experience.setEndDate(webExperince.getEndDate());
        experience.setHeadline(webExperince.getHeadline());
        experience.setStartDate(webExperince.getStartDate());
        experience.setTitle(webExperince.getTitle());
        experience.setUser(user);
        experienceRepositry.save(experience);
    }
}
