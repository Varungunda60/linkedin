package com.example.linkedin.service;

import com.example.linkedin.entity.Skills;
import com.example.linkedin.entity.User;
import com.example.linkedin.model.WebSkills;
import com.example.linkedin.repository.SkillsRepositry;
import com.example.linkedin.repository.UserRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SkillsService {
    @Autowired
    private SkillsRepositry skillsRepositry;

    @Autowired
    private UserRepositry userRepositry;

    public void saveSkills(Long id,WebSkills webSkills){
        User user=userRepositry.findById(id).get();
        Skills skills=new Skills();
        skills.setSkillName(webSkills.getSkillName());
        skills.setUser(user);
        skillsRepositry.save(skills);
    }
    public List<Skills> getSkills(Long id){
        return userRepositry.findById(id).get().getSkills();
    }
}
