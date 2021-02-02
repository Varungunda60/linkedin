package com.example.linkedin.service;

import com.example.linkedin.entity.Skills;
import com.example.linkedin.entity.User;
import com.example.linkedin.model.WebSkills;
import com.example.linkedin.repository.SkillsRepository;
import com.example.linkedin.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SkillsService {
    @Autowired
    private SkillsRepository skillsRepository;

    @Autowired
    private UserRepository userRepository;

    public void saveSkills(Long id, WebSkills webSkills) {
        if(userRepository.findById(id).isPresent()){
            User user = userRepository.findById(id).get();
            Skills skills = new Skills();
            skills.setSkillName(webSkills.getSkillName());
            skills.setUser(user);
            skillsRepository.save(skills);
        }

    }


    public void updateSkills(Long userId, Long skillId, WebSkills webSkills) {
        if (skillsRepository.findById(skillId).isPresent()) {
            if (userRepository.findById(userId).isPresent()) {
                User user = userRepository.findById(userId).get();
                Skills skills = skillsRepository.findById(skillId).get();
                skills.setSkillName(webSkills.getSkillName());
                skills.setUser(user);
                skillsRepository.save(skills);
            }
        }
    }
}
