package com.testvagrants.pojos;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder(setterPrefix = "set")
public class Player {

	private String name;
	private String country;
	private String role;
	private String priceincrores;
}
