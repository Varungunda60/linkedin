package com.example.linkedin.model;

import com.example.linkedin.entity.User;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class WebEducation {
    private String schoolName;
    private String degree;
    private String feildOfStudy;
    private String startDate;
    private String endDate;
    private Integer grade;
}
