package com.neoteric.isports.service;

import com.neoteric.isports.entity.ProfileDetails;
import com.neoteric.isports.enums.ErrorMessage;
import com.neoteric.isports.dto.Status;
import com.neoteric.isports.mappers.ProfileMapper;
import com.neoteric.isports.repository.ProfileDetailsRepository;
import com.neoteric.isports.requests.ProfileDetailsRequest;
import com.neoteric.isports.response.ProfileDetailsResponse;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfileDetailsService {

    private static final Logger logger = LogManager.getLogger(ProfileDetailsService.class);

    @Autowired
    private ProfileDetailsRepository profileDetailsRepository;


    @Autowired
    private ProfileMapper profileMapper;

    public ProfileDetailsResponse saveProfile(ProfileDetailsRequest profileDetailsRequest){

       ProfileDetails profileDetails = this.profileMapper.toEntity(profileDetailsRequest.profileDetailsDTO);

        profileDetailsRepository.save(profileDetails);

        ProfileDetailsResponse profileDetailsResponse = new ProfileDetailsResponse();
        profileDetailsResponse.profileDetailsDTO = profileDetailsRequest.profileDetailsDTO;

        Status status = new Status();
        status.setMessage(ErrorMessage.VALID_PROFILE.getMessage());
        status.setCode(ErrorMessage.VALID_PROFILE.getCode());

        profileDetailsResponse.setStatus(status);

        return profileDetailsResponse;

    }
}
