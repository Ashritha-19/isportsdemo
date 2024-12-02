package com.neoteric.isports.mappers;

import com.neoteric.isports.dto.ProfileDetailsDTO;
import com.neoteric.isports.entity.ProfileDetails;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProfileMapper {
    @Autowired
    ModelMapper modelMapper;

    public ProfileDetails toEntity(ProfileDetailsDTO profileDetailsDTO){
        return this.modelMapper.map(profileDetailsDTO,ProfileDetails.class);
    }
}
