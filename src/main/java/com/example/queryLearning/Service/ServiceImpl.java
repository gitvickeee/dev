package com.example.queryLearning.Service;

import com.example.queryLearning.DTO.PersonDTO;
import com.example.queryLearning.Response.SuccessResponse;
import org.springframework.stereotype.Service;

@Service
public interface ServiceImpl {

    SuccessResponse getall();

    SuccessResponse save(PersonDTO personDTO);
}
