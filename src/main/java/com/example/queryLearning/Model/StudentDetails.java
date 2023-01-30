package com.example.queryLearning.Model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "student_details")
public class StudentDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",updatable = false,nullable = false)
    private Long id;

    @Column(name = "standard")
    private String standard;

    @Column(name = "section")
    private String section;

    @Column(name = "medium")
    private String medium;

    @Column(name = "school_name")
    private String schoolName;

}