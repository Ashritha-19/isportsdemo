package com.neoteric.isports.enums;

public enum ErrorMessage {

    IN_VALID_ACCOUNT("Account is Invalid","ISports_4001"),

    VAILD_ACCOUNT("Account is Valid","ISports_200"),

    VALID_PAYMENT("Payment success","ISports_200"),

    INVALID_PAYMENT("Payment failed ","ISports_4001"),

    PROCESSING_PAYMENT("Payment processing","ISports_1021"),

    VALID_PRIVACY_SETTINGS("Privacy Settings is Valid","ISports_200"),

    INVALID_PRIVACY_SETTINGS("Privacy Settings is Invalid","ISports_4001"),

    VALID_PROFILE("Profile is Valid","ISports_200"),

    INVALID_PROFILE("Profile is Invalid","ISports_4001");


    private String message;

    private String code;

     ErrorMessage(String message, String code){
        this.message = message;
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public String getCode() {
        return code;
    }
}
