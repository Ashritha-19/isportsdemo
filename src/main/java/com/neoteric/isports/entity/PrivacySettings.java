package com.neoteric.isports.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity(name = "privacy_settings")
public class PrivacySettings {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "profileVisibility")
    private String profileVisibility;

    @Column(name = "displayEmailAndPhone")
    private boolean displayEmailAndPhone;

    @Column(name = "allowConnectionRequests")
    private boolean allowConnectionRequests;

    @Column(name = "receiveInvitations")
    private boolean receiveInvitations;

    @Column(name = "allowProfileSearch")
    private boolean allowProfileSearch;

    @Column(name = "directMessagePermissions")
    private String directMessagePermissions;

    @Column(name = "allowAlerts")
    private boolean allowAlerts;

}
