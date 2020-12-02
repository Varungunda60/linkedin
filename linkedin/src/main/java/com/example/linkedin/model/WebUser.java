package com.example.linkedin.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Data;

import java.util.List;

@Data
public class WebUser {
    private String name;
    private String password;
    private String fName;
    private String lName;
    private String tagLine;
    private String backgroundUrl;
    private String url;
    @JsonAlias("experience")
    private List<WebExperience> webExperiences;
    @JsonAlias("education")
    private List<WebEducation> webEducations;
    @JsonAlias("skills")
    private List<WebSkills> webSkills;
}
