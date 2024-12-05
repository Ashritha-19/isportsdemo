package com.neoteric.isports.exceptions;

import lombok.Data;

@Data
public class InvalidAccountNumberException extends RuntimeException{

    private String code;

    public InvalidAccountNumberException(String message,String code){
        super(message);
        this.code = code;
    }
}
