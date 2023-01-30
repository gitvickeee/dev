package com.example.queryLearning.ControllerClause;

import com.example.queryLearning.DTO.PersonDTO;
import com.example.queryLearning.Response.SuccessResponse;
import com.example.queryLearning.Service.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/initial")
public class Controller {

    @Autowired
    private ServiceImpl service;

    @GetMapping(value = "/getall",produces = MediaType.APPLICATION_JSON_VALUE)
    private SuccessResponse getAll(){
        return service.getall();
    }

    @PutMapping(value = "/save", produces = MediaType.APPLICATION_JSON_VALUE)
    private SuccessResponse save(PersonDTO personDTO){
        return service.save(personDTO);
    }

}
