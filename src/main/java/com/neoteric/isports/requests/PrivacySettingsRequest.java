package com.neoteric.isports.requests;

import com.neoteric.isports.dto.PrivacySettingsDTO;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class PrivacySettingsRequest {

    public PrivacySettingsDTO privacySettingsDTO;

}
