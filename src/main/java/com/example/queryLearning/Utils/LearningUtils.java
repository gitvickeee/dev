package com.example.queryLearning.Utils;

import com.example.queryLearning.DTO.PersonDTO;
import com.example.queryLearning.Model.PersonDetails;
import com.example.queryLearning.Model.StudentDetails;
import com.example.queryLearning.Repository.QueryRepository;
import com.example.queryLearning.Response.SuccessResponse;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public  class LearningUtils {

    @Autowired
    public QueryRepository queryRepository;

    public SuccessResponse save(PersonDTO personDTO)  {
        ModelMapper modelMapper = new ModelMapper();
        if(personDTO != null){
            if(personDTO.getStudent_Details()!=null){
                PersonDetails personDetails = modelMapper.map(personDTO,PersonDetails.class);
                queryRepository.save(personDetails);
            }
            else{
                System.out.println("student details cannot be found");
            }
        }
        else{
            try {
                throw new Exception("cannot find the required details");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return new SuccessResponse();
    }


    public SuccessResponse getall() {
        List<PersonDetails> person = queryRepository.findByJust();
        SuccessResponse successResponse = new SuccessResponse();
        successResponse.setData(person);
        return successResponse;
    }
}
