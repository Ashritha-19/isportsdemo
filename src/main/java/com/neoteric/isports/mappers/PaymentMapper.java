package com.neoteric.isports.mappers;

import com.neoteric.isports.dto.PaymentDetailsDTO;
import com.neoteric.isports.entity.PaymentDetails;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PaymentMapper {

    @Autowired
    private ModelMapper modelMapper;

    public PaymentDetails toEntity(PaymentDetailsDTO paymentDetailsDTO){
        return this.modelMapper.map(paymentDetailsDTO,PaymentDetails.class);
    }
}
