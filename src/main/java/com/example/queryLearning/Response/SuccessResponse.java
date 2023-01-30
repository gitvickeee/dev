package com.example.queryLearning.Response;

import lombok.Data;

import java.io.Serializable;

@Data
public class SuccessResponse <T> implements Serializable {

    private static final long serialVersionUID = 5926468583005150707L;

    private String statusMessage = "success";

    private int statusCode = 200;

    private T data;
}
