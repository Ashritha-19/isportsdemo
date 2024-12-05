package com.neoteric.isports.response;

import com.neoteric.isports.dto.PrivacySettingsDTO;
import com.neoteric.isports.dto.Status;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class PrivacySettingsResponse {

    public PrivacySettingsDTO privacySettingsDTO;

    private Status status;

}
