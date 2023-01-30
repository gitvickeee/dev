package com.example.queryLearning.Service.ServiceSection;

import com.example.queryLearning.DTO.PersonDTO;
import com.example.queryLearning.Response.SuccessResponse;
import com.example.queryLearning.Service.ServiceImpl;
import com.example.queryLearning.Utils.LearningUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceClause implements ServiceImpl {

    @Autowired
    public LearningUtils learningUtils;

    public SuccessResponse getall(){
        return learningUtils.getall();
    }

    public SuccessResponse save(PersonDTO personDTO){
        return learningUtils.save(personDTO);
    }

}
