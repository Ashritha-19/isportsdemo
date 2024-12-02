package com.neoteric.isports.service;

import com.neoteric.isports.dto.ProfileDetailsDTO;
import com.neoteric.isports.entity.AccountDetails;
import com.neoteric.isports.entity.ProfileDetails;
import com.neoteric.isports.repository.AccountDetailsRepository;
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

  /*  @Autowired
    private AccountDetailsRepository accountDetailsRepository; */

    public ProfileDetails saveProfile(ProfileDetailsDTO profileDetailsDTO){
        logger.info("Saving profile for Sport: {}", profileDetailsDTO.getSport());
        ProfileDetails profile = new ProfileDetails();
        profile.setSport(profileDetailsDTO.getSport());
        profile.setRole(profileDetailsDTO.getRole());
        profile.setPosition(profileDetailsDTO.getPosition());
        profile.setExperienceLevel(profileDetailsDTO.getExperienceLevel());
        profile.setTeam(profileDetailsDTO.getTeam());
        profile.setShortBio(profileDetailsDTO.getShortBio());
        profile.setCountry(profileDetailsDTO.getCountry());
        profile.setCity(profileDetailsDTO.getCity());

      /*  AccountDetails account = accountDetailsRepository.findById(profileDetailsDTO.getAccountId())
                .orElseThrow(() -> new RuntimeException("Account Not Found"));

        profile.setAccountDetailsEntity(account);  */

        return profileDetailsRepository.save(profile);


    }


}
