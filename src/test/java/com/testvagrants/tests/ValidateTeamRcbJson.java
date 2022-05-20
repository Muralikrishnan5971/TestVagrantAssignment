package com.testvagrants.tests;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.testng.annotations.Test;

import com.testvagrants.factory.TeamFactory;
import com.testvagrants.pojos.Player;
import com.testvagrants.pojos.TeamRcb;

public class ValidateTeamRcbJson {

	@Test
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

	@Test
	public void validateTeamHasAtleastOneWicketKeeper() {

		TeamRcb teamRcb = TeamFactory.createRcbTeam();

		List<Player> listOfPlayersToTest = teamRcb.getPlayer();

		int wicketKeeperCount = 0;

		for (Player player : listOfPlayersToTest) {

			if ((player.getRole().contains("Wicket-keeper"))) {

				wicketKeeperCount++;
			}

		}

		assertThat(wicketKeeperCount).isGreaterThanOrEqualTo(1);
	}
}
