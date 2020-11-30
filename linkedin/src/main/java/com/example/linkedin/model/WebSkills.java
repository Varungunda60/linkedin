package com.example.linkedin.model;

import com.example.linkedin.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WebSkills {
    private String skillName;
    private User user;
}
