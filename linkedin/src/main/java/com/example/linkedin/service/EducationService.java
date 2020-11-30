package com.example.linkedin.service;

import com.example.linkedin.entity.Education;
import com.example.linkedin.entity.User;
import com.example.linkedin.model.WebEducation;
import com.example.linkedin.repository.EducationRepositry;
import com.example.linkedin.repository.UserRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducationService {
    @Autowired
    private EducationRepositry educationRepositry;

    @Autowired
    private UserRepositry userRepositry;
    public void addEducation(Long id,WebEducation webEducation){
        Education education=new Education();
        User user= userRepositry.findById(id).get();
        education.setUser(user);
        education.setDegree(webEducation.getDegree());
        education.setEndDate(webEducation.getEndDate());
        education.setFeildOfStudy(webEducation.getFeildOfStudy());
        education.setGrade(webEducation.getGrade());
        education.setSchoolName(webEducation.getSchoolName());
        education.setStartDate(webEducation.getStartDate());
        educationRepositry.save(education);
    }

    public List<Education> getEducationList(Long id){
        return userRepositry.findById(id).get().getEducation();
    }
}
