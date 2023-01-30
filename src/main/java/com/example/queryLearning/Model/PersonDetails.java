package com.example.queryLearning.Model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "PersonDetails")
public class PersonDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id",updatable = false,nullable = false)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "mobileNumber")
    private String mobileNumber;

    @Column(name = "city")
    private String city;

    @Column(name = "state")
    private String state;

    @Column(name = "country")
    private String country;

    /*@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "student_id_fk")
    private StudentDetails student_Details;*/
}
