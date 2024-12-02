package com.neoteric.isports.dto;

import lombok.Data;

import java.util.Date;

@Data
public class AccountDetailsDTO {

    private String accountType;

    private String fullName;

    private String email;

    private String mobileNumber;

    private Date dob;

    private String gender;

}
