package com.neoteric.isports.requests;

import com.neoteric.isports.dto.ProfileDetailsDTO;
import lombok.Data;
import org.springframework.stereotype.Component;


@Data
@Component
public class ProfileDetailsRequest {

   public ProfileDetailsDTO profileDetailsDTO;

}
