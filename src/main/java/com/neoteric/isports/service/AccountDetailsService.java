package com.neoteric.isports.service;

import com.neoteric.isports.dto.AccountDetailsDTO;
import com.neoteric.isports.entity.AccountDetails;
import com.neoteric.isports.mappers.AccountMapper;
import com.neoteric.isports.repository.AccountDetailsRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountDetailsService {

    private static final Logger logger = LogManager.getLogger(AccountDetailsService.class);

    @Autowired
    private AccountDetailsRepository accountDetailsRepository;

    @Autowired
    private AccountMapper accountMapper;

  /*  @Autowired
    private AccountDetails accountDetails; */

    public AccountDetails saveAccount(AccountDetailsDTO accountDetailsDTO){
        long startTime = System.nanoTime();

        logger.info("Saving account for : {}",accountDetailsDTO.getMobileNumber());
       AccountDetails accountDetails = this.accountMapper.toEntity(accountDetailsDTO);

        long endTime = System.nanoTime();

        long duration = (endTime-startTime)/1000000;

        logger.info("Method execution time :"+duration +"ms");

        return accountDetailsRepository.save(accountDetails);



    }

}
