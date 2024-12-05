package com.neoteric.isports.service;

import com.neoteric.isports.entity.PrivacySettings;
import com.neoteric.isports.enums.ErrorMessage;
import com.neoteric.isports.dto.Status;
import com.neoteric.isports.mappers.PrivacySettingsMapper;
import com.neoteric.isports.repository.PrivacySettingsRepository;
import com.neoteric.isports.requests.PrivacySettingsRequest;
import com.neoteric.isports.response.PrivacySettingsResponse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrivacySettingsService {


    private static final Logger logger = LogManager.getLogger(PrivacySettingsService.class);

    @Autowired
    private PrivacySettingsRepository privacySettingsRepository;

    @Autowired
    private PrivacySettingsMapper privacySettingsMapper;

    public PrivacySettingsResponse savePrivacySettings(PrivacySettingsRequest privacySettingsRequest){

        PrivacySettings privacySettings = privacySettingsMapper.toEntity(privacySettingsRequest.privacySettingsDTO);

        privacySettingsRepository.save(privacySettings);

        PrivacySettingsResponse privacySettingsResponse=new PrivacySettingsResponse();
        privacySettingsResponse.privacySettingsDTO = privacySettingsRequest.privacySettingsDTO;

        Status status = new Status();
        status.setMessage(ErrorMessage.VALID_PRIVACY_SETTINGS.getMessage());
        status.setCode(ErrorMessage.VALID_PRIVACY_SETTINGS.getCode());

        privacySettingsResponse.setStatus(status);

        return privacySettingsResponse;
    }


}
