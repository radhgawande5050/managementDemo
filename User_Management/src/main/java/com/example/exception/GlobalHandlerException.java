package com.example.exception;

import com.example.payloads.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalHandlerException {
@ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<ApiResponse>resourceNotFoundException(ResourceNotFoundException ex){

    ApiResponse e=new ApiResponse();
    String message = e.getMessage();
    e.setMessage(message);
    e.setSuccess(false);

    return new ResponseEntity<ApiResponse>(e, HttpStatus.NOT_FOUND);


}
}
