package com.example.linkedin.service;

import com.example.linkedin.entity.User;
import com.example.linkedin.model.WebExperince;
import com.example.linkedin.model.WebUser;
import com.example.linkedin.repository.UserRepositry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepositry userRepositry;

    public void addUser(WebUser webUser){
        User user=new User();
        user.setBackgroundUrl(webUser.getBackgroundUrl());
        user.setEducation(webUser.getEducation());
        user.setExperience(webUser.getExperience());
        user.setFName(webUser.getFName());
        user.setLName(webUser.getLName());
        user.setName(webUser.getName());
        user.setPassword(webUser.getPassword());
        user.setSkills(webUser.getSkills());
        user.setTagLine(webUser.getTagLine());
        user.setUrl(webUser.getUrl());

        userRepositry.save(user);
    }

    public User getUser(Long  id){
        return userRepositry.findById(id).get();
    }

}
