package com.handup.handupserver.model;

import java.util.Optional;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Shelter {
	private String shelterName;
    private String shelterAddress;
    private String shelterCity;
    private String shelterState;
    private Optional<String> shelterPhoneNumber;
    private String shelterWebsite;
    
}
