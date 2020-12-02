package com.example.linkedin.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WebCompany {

    private String name;
    private String location;
    private String industryType;
}
