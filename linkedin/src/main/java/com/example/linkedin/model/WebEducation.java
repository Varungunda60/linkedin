package com.example.linkedin.model;

import com.example.linkedin.entity.User;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WebEducation {
    private String schoolName;
    private String degree;
    private String feildOfStudy;

    @JsonFormat(pattern="yyyy-MM-dd")
    private Date StartDate;
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date EndDate;

    private Integer grade;
    private User user;

}
