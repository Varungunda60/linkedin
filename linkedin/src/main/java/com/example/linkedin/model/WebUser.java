package com.example.linkedin.model;

import com.example.linkedin.entity.Education;
import com.example.linkedin.entity.Experience;
import com.example.linkedin.entity.Skills;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;

public class WebUser {
    private String name;
    private String password;
    private String fName;
    private String lName;
    private String TagLine;
    private String BackgroundUrl;
    private String Url;
    private List<Experience> experience;
    private List<Education> education;
    private List<Skills> skills;
}
