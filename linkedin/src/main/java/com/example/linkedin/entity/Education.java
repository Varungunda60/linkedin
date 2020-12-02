package com.example.linkedin.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Education {

    @Id
    @GeneratedValue()
    private Long id;

    @Column(nullable = false)
    private String schoolName;

    @Column(nullable = false)
    private String degree;

    @Column(nullable = false)
    private String feildOfStudy;
    private String StartDate;
    private String EndDate;

    private Integer grade;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
}