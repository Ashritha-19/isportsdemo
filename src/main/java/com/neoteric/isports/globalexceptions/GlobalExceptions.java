package com.neoteric.isports.globalexceptions;


import com.neoteric.isports.dto.Status;
import com.neoteric.isports.exceptions.InvalidAccountException;
import com.neoteric.isports.exceptions.InvalidAccountNumberException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptions {


    @ExceptionHandler(InvalidAccountException.class)
    public ResponseEntity<Status> handleInvalidAccountException(InvalidAccountException accountException){

        Status status = new Status();
        status.setMessage(accountException.getMessage());
        status.setCode(accountException.getCode());

      return new ResponseEntity<>(status, HttpStatus.BAD_REQUEST);

    }

    @ExceptionHandler(InvalidAccountNumberException.class)
   public ResponseEntity<Status> handleInvalidAccountNumberException(InvalidAccountNumberException accountNumberException){

     Status status = new Status();
     status.setMessage(accountNumberException.getMessage());
     status.setCode(accountNumberException.getCode());

      return new ResponseEntity<>(status,HttpStatus.BAD_REQUEST);
    }
}
