package com.example.linkedin.Controller;

import com.example.linkedin.entity.Experience;
import com.example.linkedin.model.WebExperience;
import com.example.linkedin.service.ExperienceService;
import com.example.linkedin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ExperienceController {

    @Autowired
    private ExperienceService experienceService;

    @Autowired
    private UserService userService;

    @PostMapping("/user/Experience/{id}")
    public void saveExperience(@PathVariable Long id, @RequestBody WebExperience webExperience){
        experienceService.saveExperience(id,webExperience);
    }
    @GetMapping("/user/Experience/{id}")
    public List<Experience> getExperience(@PathVariable Long id){
        return userService.getUser(id).getExperience();
    }

}
