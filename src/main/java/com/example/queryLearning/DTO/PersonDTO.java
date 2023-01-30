package com.example.queryLearning.DTO;

import com.example.queryLearning.Model.StudentDetails;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@Component
public class PersonDTO {

    private Long id;

    private String name;

    private String mobileNumber;

    private String city;

    private String state;

    private String country;

    private StudentDTO student_Details;
}
