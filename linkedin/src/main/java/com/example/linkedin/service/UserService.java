package com.example.linkedin.service;

import com.example.linkedin.entity.User;
import com.example.linkedin.model.WebEducation;
import com.example.linkedin.model.WebExperience;
import com.example.linkedin.model.WebSkills;
import com.example.linkedin.model.WebUser;
import com.example.linkedin.repository.UserRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepositry userRepositry;

    @Autowired
    private SkillsService skillsService;

    @Autowired
    private EducationService educationService;

    @Autowired
    private ExperienceService experienceService;

    public void saveUser(WebUser webUser) {
        User user = new User();
        user.setUrl(webUser.getUrl());
        user.setTagLine(webUser.getTagLine());
        user.setPassword(webUser.getPassword());
        user.setName(webUser.getName());
        user.setLastName(webUser.getLastName());
        user.setFirstName(webUser.getFirstName());
        user.setBackgroundUrl(webUser.getBackgroundUrl());
        user = userRepositry.save(user);
        userRepositry.flush();
        if (webUser.getWebEducations() != null) {
            for (WebEducation webEducation : webUser.getWebEducations()) {
                educationService.saveEducation(user.getId(), webEducation);
            }
        }

        if (webUser.getWebExperiences() != null) {
            for (WebExperience webExperience : webUser.getWebExperiences()) {
                experienceService.saveExperience(user.getId(), webExperience);
            }
        }

        if (webUser.getWebSkills() != null) {
            for (WebSkills webSkills : webUser.getWebSkills()) {
                skillsService.saveSkills(user.getId(), webSkills);
            }
        }
    }

    public User getUser(Long id) {
        return userRepositry.findById(id).get();
    }

    public List<User> getAllUsers() {
        return userRepositry.findAll();
    }


}
