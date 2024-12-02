package com.neoteric.isports.service;

import com.neoteric.isports.dto.ProfileDetailsDTO;
import com.neoteric.isports.entity.ProfileDetails;
import com.neoteric.isports.mappers.ProfileMapper;
import com.neoteric.isports.repository.ProfileDetailsRepository;
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

    public ProfileDetails saveProfile(ProfileDetailsDTO profileDetailsDTO){
        logger.info("Saving profile for Sport: {}", profileDetailsDTO.getSport());
       ProfileDetails profileDetails = this.profileMapper.toEntity(profileDetailsDTO);



      /* AccountDetails account = accountDetailsRepository.findById(profileDetailsDTO.getAccountId())
                .orElseThrow(() -> new RuntimeException("Account Not Found"));

        profile.setAccountDetailsEntity(account);  */

        return profileDetailsRepository.save(profileDetails);


    }
}
