package com.neoteric.isports.exceptions;

import lombok.Data;

@Data
public class InvalidAccountException extends RuntimeException{
private  String code;
    public InvalidAccountException(String message , String code){
        super(message);
        this.code=code;
    }

}
