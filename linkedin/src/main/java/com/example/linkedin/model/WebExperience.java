package com.example.linkedin.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.jetbrains.annotations.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WebExperience {

    private String title;
    private String headline;
    private String startDate;
    private String endDate;
    private String employmentType;
    @NonNull
    @NotNull
    @JsonAlias("company")
    private WebCompany webCompany;
}
