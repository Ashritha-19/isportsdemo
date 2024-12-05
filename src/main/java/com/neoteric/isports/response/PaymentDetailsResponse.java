package com.neoteric.isports.response;

import com.neoteric.isports.dto.PaymentDetailsDTO;
import com.neoteric.isports.dto.Status;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class PaymentDetailsResponse {

   public PaymentDetailsDTO paymentDetailsDTO;

   private Status status;

}
