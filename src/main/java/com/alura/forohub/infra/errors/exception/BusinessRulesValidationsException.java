package com.alura.forohub.infra.errors.exception;

public class BusinessRulesValidationsException extends RuntimeException{

    public BusinessRulesValidationsException(String message){
        super(message);
    }
}
