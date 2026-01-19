package com.example.DocumentManagementApplication.exception;

public class FileNotFoundException extends RuntimeException{

    public FileNotFoundException(String message){
        super(message);
    }
}
