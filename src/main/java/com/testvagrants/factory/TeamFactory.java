package com.testvagrants.factory;

import java.util.ArrayList;
import java.util.List;

import com.testvagrants.pojos.Player;
import com.testvagrants.pojos.TeamRcb;

public final class TeamFactory {

	private TeamFactory() {
		
	}
	
	public static TeamRcb createRcbTeam() {

		Player player01 = Player.builder().setName("Faf Du Plessis").setCountry("South Africa").setRole("Batsman").setPriceincrores("7").build();
		Player player02 = Player.builder().setName("Virat Kohli").setCountry("India").setRole("Batsman").setPriceincrores("15").build();
		Player player03 = Player.builder().setName("Glenn Maxwell").setCountry("Australia").setRole("Batsman").setPriceincrores("11").build();
		Player player04 = Player.builder().setName("Mohammad Siraj").setCountry("India").setRole("Bowler").setPriceincrores("7").build();
		Player player05 = Player.builder().setName("Harshal Patel").setCountry("India").setRole("Batsman").setPriceincrores("10.75").build();
		Player player06 = Player.builder().setName("Wanindu Hasaranga").setCountry("Sri Lanka").setRole("Bowler").setPriceincrores("10.75").build();
		Player player07 = Player.builder().setName("Dinesh Karthik").setCountry("India").setRole("Wicket-keeper").setPriceincrores("5.5").build();
		Player player08 = Player.builder().setName("Shahbaz Ahmed").setCountry("India").setRole("All-Rounder").setPriceincrores("2.4").build();
		Player player09 = Player.builder().setName("Rajat Patidar").setCountry("India").setRole("Batsman").setPriceincrores("0.20").build();
		Player player10 = Player.builder().setName("Josh Hazlewood").setCountry("Australia").setRole("Bowler").setPriceincrores("7.75").build();
		Player player11 = Player.builder().setName("Mahipal Lomror").setCountry("India").setRole("Bowler").setPriceincrores("7.75").build();
		
		List<Player> listOfPlayers = new ArrayList<>();
		
		listOfPlayers.add(player01);
		listOfPlayers.add(player02);
		listOfPlayers.add(player03);
		listOfPlayers.add(player04);
		listOfPlayers.add(player05);
		listOfPlayers.add(player06);
		listOfPlayers.add(player07);
		listOfPlayers.add(player08);
		listOfPlayers.add(player09);
		listOfPlayers.add(player10);
		listOfPlayers.add(player11);
		
		return TeamRcb.builder().setName("Royal Challengers Bangalore").setLocation("Bangalore").setPlayer(listOfPlayers).build();

	}
	
}
