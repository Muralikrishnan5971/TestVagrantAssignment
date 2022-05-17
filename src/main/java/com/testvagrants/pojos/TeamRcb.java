package com.testvagrants.pojos;

import java.util.List;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder(setterPrefix = "set")
public class TeamRcb {

	private String name;
	private String location;
	private List<Object> player;
}
