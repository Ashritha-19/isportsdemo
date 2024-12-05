package com.neoteric.isports.service;

import com.neoteric.isports.entity.AccountDetails;
import com.neoteric.isports.entity.Login;
import com.neoteric.isports.enums.ErrorMessage;
import com.neoteric.isports.dto.Status;
import com.neoteric.isports.exceptions.InvalidAccountException;
import com.neoteric.isports.mappers.AccountMapper;
import com.neoteric.isports.repository.AccountDetailsRepository;
import com.neoteric.isports.repository.LoginRepository;
import com.neoteric.isports.requests.AccountDetailsRequest;
import com.neoteric.isports.response.AccountDetailsResponse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Time;
import java.util.Optional;

@Service
public class AccountDetailsService {

    private static final Logger logger = LogManager.getLogger(AccountDetailsService.class);

    @Autowired
    private AccountDetailsRepository accountDetailsRepository;

    @Autowired
    private AccountMapper accountMapper;

    @Autowired
    private LoginRepository loginRepository;

    public AccountDetailsResponse saveAccount(AccountDetailsRequest accountDetailsRequest ){

        logger.info("saveAccount method start's here");

        final AccountDetailsResponse[] response = new AccountDetailsResponse[1];
        TimeExecution.calculateExecutionTime("saveAccount()",() ->{

        Optional<Login>login = loginRepository.findByPhoneNumber(accountDetailsRequest.getPhoneNumber());

        if (login.isPresent()) {

            AccountDetails accountDetails = this.accountMapper.toEntity(accountDetailsRequest.accountDetailsDTO);
            accountDetailsRepository.save(accountDetails);

            AccountDetailsResponse accountDetailsResponse = new AccountDetailsResponse();
            accountDetailsResponse.accountDetailsDTO = accountDetailsRequest.accountDetailsDTO;
            Status status = new Status();
            status.setMessage(ErrorMessage.VAILD_ACCOUNT.getMessage());
            status.setCode(ErrorMessage.VAILD_ACCOUNT.getCode());
            accountDetailsResponse.setStatus(status);

            response[0] = accountDetailsResponse;

        }else{
            throw new InvalidAccountException(ErrorMessage.VAILD_ACCOUNT.getMessage(),ErrorMessage.VAILD_ACCOUNT.getCode());
            }

            logger.info("saveAccount method end's here");
        });
        return response[0];
    }
}
