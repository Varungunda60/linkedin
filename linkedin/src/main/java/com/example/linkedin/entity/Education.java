package com.example.linkedin.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Education {

    @Id
    @GeneratedValue()
    private Long id;

    @Column(nullable=false)
    private String schoolName;

    @Column(nullable=false)
    private String degree;

    @Column(nullable=false)
    private String feildOfStudy;

    @JsonFormat(pattern="yyyy-MM-dd")
    private Date StartDate;
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date EndDate;

    private Integer grade;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    @JsonBackReference
    private User user;
}