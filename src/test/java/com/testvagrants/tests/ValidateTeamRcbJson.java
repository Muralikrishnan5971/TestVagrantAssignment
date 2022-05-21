package com.testvagrants.tests;

import static org.assertj.core.api.Assertions.*;

import java.util.List;

import org.testng.annotations.Test;

import com.testvagrants.factory.TeamFactory;
import com.testvagrants.pojos.Player;
import com.testvagrants.pojos.TeamRcb;

public class ValidateTeamRcbJson {

	@Test(enabled = true, 
			priority = 0,
			description = "This test is to validate team has only four foreign players")
	public void validateTeamOnlyHasFourForeignPlayers() {

		TeamRcb teamRcb = TeamFactory.createRcbTeam();

		List<Player> listOfPlayers = teamRcb.getPlayer();

		int foreignPlayerCount = 0;

		for (Player player : listOfPlayers) {

			if (!(player.getCountry().contains("India"))) {

				foreignPlayerCount++;
			}

		}

		assertThat(foreignPlayerCount).as("Number of Foreign Players").isEqualTo(4);
	}

	@Test(enabled = true, 
			priority = 1,
			description = "This test is to validate team has atleast one Wicket-keeper")
	public void validateTeamHasAtleastOneWicketKeeper() {

		TeamRcb teamRcb = TeamFactory.createRcbTeam();

		List<Player> listOfPlayersToTest = teamRcb.getPlayer();

		int wicketKeeperCount = 0;

		for (Player player : listOfPlayersToTest) {

			if ((player.getRole().contains("Wicket-keeper"))) {

				wicketKeeperCount++;
			}

		}

		assertThat(wicketKeeperCount).as("Number of Wicket-Keepers").isGreaterThanOrEqualTo(1);
	}
}
