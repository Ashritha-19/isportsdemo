package com.neoteric.isports.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class ProfileDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String sport;

    @Column(nullable = false)
    private String role;

    private String position;

    @Column(nullable = false)
    private String experienceLevel;

    private String team;

    @Column(length = 500)
    private String shortBio;

    @Column(nullable = false)
    private String country;

    @Column(nullable = false)
    private String city;


   /* @OneToOne
    @JoinColumn(name = "account_details_id", nullable = false)
    private AccountDetails accountDetailsEntity;   */


}
