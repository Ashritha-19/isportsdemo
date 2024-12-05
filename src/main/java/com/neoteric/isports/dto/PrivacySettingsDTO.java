package com.neoteric.isports.dto;

import lombok.Data;

@Data
public class PrivacySettingsDTO {

    private String profileVisibility;

    private boolean displayEmailAndPhone;

    private boolean allowConnectionRequests;

    private boolean receiveInvitations;

    private boolean allowProfileSearch;

    private String directMessagePermissions;

    private boolean allowAlerts;


}
