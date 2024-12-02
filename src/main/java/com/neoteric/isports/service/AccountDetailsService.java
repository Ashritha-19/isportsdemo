package com.neoteric.isports.service;

import com.neoteric.isports.dto.AccountDetailsDTO;
import com.neoteric.isports.entity.AccountDetails;
import com.neoteric.isports.repository.AccountDetailsRepository;
import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountDetailsService {

    private static final Logger logger = LogManager.getLogger(AccountDetailsService.class);

    @Autowired
    private AccountDetailsRepository accountDetailsRepository;

    public AccountDetails saveAccount(AccountDetailsDTO accountDetailsDTO){
        logger.info("Saving account for : {}",accountDetailsDTO.getMobileNumber());
        AccountDetails account = new AccountDetails();
        account.setAccountType(accountDetailsDTO.getAccountType());
        account.setFullName(accountDetailsDTO.getFullName());
        account.setEmail(accountDetailsDTO.getEmail());
        account.setMobileNumber(accountDetailsDTO.getMobileNumber());
        account.setDob(accountDetailsDTO.getDob());
        account.setGender(accountDetailsDTO.getGender());

        return accountDetailsRepository.save(account);

    }

}
