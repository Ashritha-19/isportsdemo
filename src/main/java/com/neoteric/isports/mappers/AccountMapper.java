package com.neoteric.isports.mappers;

import com.neoteric.isports.dto.AccountDetailsDTO;
import com.neoteric.isports.entity.AccountDetails;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AccountMapper {

    @Autowired
    ModelMapper modelMapper;

    public AccountDetails toEntity(AccountDetailsDTO accountDetailsDTO) {
        return this.modelMapper.map(accountDetailsDTO, AccountDetails.class);
    }
}
