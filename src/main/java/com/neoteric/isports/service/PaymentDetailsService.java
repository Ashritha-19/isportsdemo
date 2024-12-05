package com.neoteric.isports.service;

import com.neoteric.isports.entity.PaymentDetails;
import com.neoteric.isports.enums.ErrorMessage;
import com.neoteric.isports.dto.Status;
import com.neoteric.isports.exceptions.InvalidAccountNumberException;
import com.neoteric.isports.mappers.PaymentMapper;
import com.neoteric.isports.repository.PaymentDetailsRepository;
import com.neoteric.isports.requests.PaymentDetailsRequest;
import com.neoteric.isports.response.PaymentDetailsResponse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentDetailsService {

      private static final Logger logger = LogManager.getLogger(PaymentDetailsService.class);

      @Autowired
      private PaymentDetailsRepository paymentDetailsRepository;

      @Autowired
      private PaymentMapper paymentMapper;

    public PaymentDetailsResponse savePaymentDetails(PaymentDetailsRequest paymentDetailsRequest){

        if (!isValidAccountNumber(paymentDetailsRequest.paymentDetailsDTO.getAccountNumber())){
            throw new InvalidAccountNumberException(ErrorMessage.INVALID_PAYMENT.getMessage(), ErrorMessage.INVALID_PAYMENT.getCode());
        }

        PaymentDetails paymentDetails = this.paymentMapper.toEntity(paymentDetailsRequest.paymentDetailsDTO);
        paymentDetailsRepository.save(paymentDetails);
        PaymentDetailsResponse paymentDetailsResponse = new PaymentDetailsResponse();
        paymentDetailsResponse.paymentDetailsDTO = paymentDetailsRequest.paymentDetailsDTO;
        Status status = new Status();
        status.setMessage(ErrorMessage.VALID_PAYMENT.getMessage());
        status.setCode(ErrorMessage.VALID_PAYMENT.getCode());
        paymentDetailsResponse.setStatus(status);
        return paymentDetailsResponse;
    }

    private boolean isValidAccountNumber(String accountNumber){
        return accountNumber != null && accountNumber.matches("^\\d{10,16}$");
    }
}
