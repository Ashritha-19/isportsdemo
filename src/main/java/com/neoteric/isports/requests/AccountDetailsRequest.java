package com.neoteric.isports.requests;

import com.neoteric.isports.dto.AccountDetailsDTO;
import com.neoteric.isports.dto.LoginDTO;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class AccountDetailsRequest extends LoginDTO {

  public   AccountDetailsDTO accountDetailsDTO;

}
