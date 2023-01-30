package com.example.queryLearning.DTO;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class StudentDTO {

    private Long id;

    private String standard;

    private String section;

    private String medium;

    private String schoolName;
}
