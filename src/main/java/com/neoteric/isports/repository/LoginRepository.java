package com.neoteric.isports.repository;

import com.neoteric.isports.entity.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface LoginRepository extends JpaRepository<Login,Long> {

    Optional<Login> findByPhoneNumber(String phoneNumber);


}
