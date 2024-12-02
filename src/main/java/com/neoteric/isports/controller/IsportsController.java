package com.neoteric.isports.controller;

import com.neoteric.isports.dto.AccountDetailsDTO;
import com.neoteric.isports.dto.ProfileDetailsDTO;
import com.neoteric.isports.entity.AccountDetails;
import com.neoteric.isports.entity.ProfileDetails;
import com.neoteric.isports.service.AccountDetailsService;
import com.neoteric.isports.service.ProfileDetailsService;
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

    @PostMapping("/account")
    public AccountDetails createAccount(@RequestBody AccountDetailsDTO accountDetailsDTO){
        logger.info("Creating account for: {}", accountDetailsDTO.getMobileNumber());
        return accountDetailsService.saveAccount(accountDetailsDTO);

    }


    @PostMapping("/profile")
    public ProfileDetails createProfile(@RequestBody ProfileDetailsDTO profileDetailsDTO){
        logger.info("Creating profile for sport {}",profileDetailsDTO.getSport());
        return profileDetailsService.saveProfile(profileDetailsDTO);
    }

}
