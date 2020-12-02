package com.example.linkedin.Controller;

import com.example.linkedin.entity.Skills;
import com.example.linkedin.model.WebExperience;
import com.example.linkedin.model.WebSkills;
import com.example.linkedin.service.SkillsService;
import com.example.linkedin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SkillsController {

    @Autowired
    private SkillsService skillsService;

    @Autowired
    private UserService userService;

    @PostMapping("/user/Skills/{id}")
    public void saveSkills(@PathVariable Long id, @RequestBody WebSkills webSkills){
        skillsService.saveSkills(id,webSkills);
    }

    @GetMapping("/user/Skills/{id}")
    public List<Skills> getSkills(@PathVariable Long id){
        return userService.getUser(id).getSkills();
    }

}
