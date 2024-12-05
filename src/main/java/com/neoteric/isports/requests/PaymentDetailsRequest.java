package com.neoteric.isports.requests;

import com.neoteric.isports.dto.PaymentDetailsDTO;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class PaymentDetailsRequest {

    public PaymentDetailsDTO paymentDetailsDTO;

}
