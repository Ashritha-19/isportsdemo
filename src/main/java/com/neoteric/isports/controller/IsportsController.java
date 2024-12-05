package com.neoteric.isports.controller;

import com.neoteric.isports.requests.AccountDetailsRequest;
import com.neoteric.isports.requests.PaymentDetailsRequest;
import com.neoteric.isports.requests.PrivacySettingsRequest;
import com.neoteric.isports.requests.ProfileDetailsRequest;
import com.neoteric.isports.response.AccountDetailsResponse;
import com.neoteric.isports.response.PaymentDetailsResponse;
import com.neoteric.isports.response.PrivacySettingsResponse;
import com.neoteric.isports.response.ProfileDetailsResponse;
import com.neoteric.isports.service.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class IsportsController {

    private static final Logger logger = LogManager.getLogger(IsportsController.class);

    @Autowired
    private AccountDetailsService accountDetailsService;

    @Autowired
    private ProfileDetailsService profileDetailsService;

    @Autowired
    private PaymentDetailsService paymentDetailsService;

    @Autowired
    private PrivacySettingsService privacySettingsService;


    @PostMapping("/account")
    public AccountDetailsResponse createAccount(@RequestBody AccountDetailsRequest accountDetailsRequest){
        return accountDetailsService.saveAccount(accountDetailsRequest);

    }

    @PostMapping("/profile")
    public ProfileDetailsResponse createProfile(@RequestBody ProfileDetailsRequest profileDetailsRequest){

        return profileDetailsService.saveProfile(profileDetailsRequest);
    }

    @PostMapping("/payment")
    public PaymentDetailsResponse createPayment(@RequestBody PaymentDetailsRequest paymentDetailsRequest){

        return paymentDetailsService.savePaymentDetails(paymentDetailsRequest);
    }

    @PostMapping("/settings")
    public PrivacySettingsResponse createSettings(@RequestBody PrivacySettingsRequest privacySettingsRequest){
        logger.info("Creating settings");
        return privacySettingsService.savePrivacySettings(privacySettingsRequest);
    }
}
