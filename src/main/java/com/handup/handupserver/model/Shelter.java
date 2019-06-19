package com.handup.handupserver.model;

import java.util.Optional;

import lombok.Data;

public @Data class Shelter {
	private String shelterName;
    private String shelterAddress;
    private String shelterCity;
    private String shelterState;
    private Optional<String> shelterPhoneNumber;
    private String shelterWebsite;
    
}
