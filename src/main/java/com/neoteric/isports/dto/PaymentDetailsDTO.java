package com.neoteric.isports.dto;

import lombok.Data;

@Data
public class PaymentDetailsDTO {

    private String accountNumber;

    private String bankName;

    private String accountHolderName;

    private String ifscCode;

    private String paymentMode;

    private  String upiNo;

}
