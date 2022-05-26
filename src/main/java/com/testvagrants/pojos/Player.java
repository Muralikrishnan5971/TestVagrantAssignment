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

	public boolean isForeign() {

		if (!(country.equals("India")))
			return true;
		else
			return false;

	}

	public boolean isWicketKeeper() {

		if ((role.equals("Wicket-keeper")))
			return true;
		else
			return false;
	}

}
