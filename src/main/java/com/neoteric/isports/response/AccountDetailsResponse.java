package com.neoteric.isports.response;

import com.neoteric.isports.dto.AccountDetailsDTO;
import com.neoteric.isports.dto.Status;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class AccountDetailsResponse {

   public AccountDetailsDTO accountDetailsDTO;

   private Status status;

}
