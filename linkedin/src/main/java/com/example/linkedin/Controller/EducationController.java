package com.example.linkedin.Controller;

import com.example.linkedin.entity.Education;
import com.example.linkedin.model.WebEducation;
import com.example.linkedin.service.EducationService;
import com.example.linkedin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EducationController {

    @Autowired
    private EducationService educationService;

    @Autowired
    private UserService userService;

    @PostMapping("user/education/{id}")
    public void saveEducation(@PathVariable Long id, @RequestBody WebEducation webEducation) {
        educationService.saveEducation(id, webEducation);
    }

    @GetMapping("user/education/{id}")
    public List<Education> getEducation(@PathVariable Long id) {
        return userService.getUser(id).getEducation();
    }
}
