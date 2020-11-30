package com.example.linkedin.model;

import com.example.linkedin.entity.Company;
import com.example.linkedin.entity.User;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.jetbrains.annotations.NotNull;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WebExperince {

    private String title;
    private String headline;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date startDate;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date endDate;
    private String employmentType;
    @NonNull
    @NotNull
    private Company company;
    private User user;

}
