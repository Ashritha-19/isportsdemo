package com.neoteric.isports.response;

import com.neoteric.isports.dto.ProfileDetailsDTO;
import com.neoteric.isports.dto.Status;
import lombok.Data;
import org.springframework.stereotype.Component;


@Data
@Component
public class ProfileDetailsResponse {

  public ProfileDetailsDTO profileDetailsDTO;

  private Status status;

}
