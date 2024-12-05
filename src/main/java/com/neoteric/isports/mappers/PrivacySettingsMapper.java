package com.neoteric.isports.mappers;

import com.neoteric.isports.dto.PrivacySettingsDTO;
import com.neoteric.isports.entity.PrivacySettings;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PrivacySettingsMapper {

    @Autowired
    private ModelMapper modelMapper;

    public PrivacySettings toEntity(PrivacySettingsDTO privacySettingsDTO){
        return this.modelMapper.map(privacySettingsDTO, PrivacySettings.class);
    }
}
