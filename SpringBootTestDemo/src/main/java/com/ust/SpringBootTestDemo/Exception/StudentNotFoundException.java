package com.ust.SpringBootTestDemo.Exception;
public class StudentNotFoundException extends RuntimeException{
    private static final long serialversionUID= 1L;
    public StudentNotFoundException(String message){
        super(message);
    }
}
