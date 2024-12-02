package com.neoteric.isports.repository;

import com.neoteric.isports.entity.ProfileDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileDetailsRepository extends JpaRepository<ProfileDetails,Long> {


}
