package com.example.linkedin.service;

import com.example.linkedin.entity.Education;
import com.example.linkedin.entity.User;
import com.example.linkedin.model.WebEducation;
import com.example.linkedin.repository.EducationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducationService {
    @Autowired
    private EducationRepository educationRepository;

    @Autowired
    private UserService userService;
    public void saveEducation(Long id,WebEducation webEducation){
        Education education=new Education();
        User user= userService.getUser(id);
        education.setUser(user);
        education.setDegree(webEducation.getDegree());
        education.setEndDate(webEducation.getEndDate());
        education.setFieldOfStudy(webEducation.getFieldOfStudy());
        education.setGrade(webEducation.getGrade());
        education.setSchoolName(webEducation.getSchoolName());
        education.setStartDate(webEducation.getStartDate());
        educationRepository.save(education);
    }
    public void DeleteEducation(Long id){
        educationRepository.deleteById(id);
    }
    public List<Education> getEducationList(Long id){
        return userService.getUser(id).getEducation();
    }
    public void updateEducation(Long userId,Long companyId,WebEducation webEducation){
        if(educationRepository.findById(companyId).isPresent()){
            Education education=new Education();
            User user= userService.getUser(userId);
            education.setUser(user);
            education.setDegree(webEducation.getDegree());
            education.setEndDate(webEducation.getEndDate());
            education.setFieldOfStudy(webEducation.getFieldOfStudy());
            education.setGrade(webEducation.getGrade());
            education.setSchoolName(webEducation.getSchoolName());
            education.setStartDate(webEducation.getStartDate());
            educationRepository.save(education);
        }
    }
}
