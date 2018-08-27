package com.bnb.step_definitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.bnb.pages.SigninPage;
import com.bnb.pages.TeamPage;
import com.bnb.utilities.BrowserUtils;

import cucumber.api.java.en.Then;

public class TeamPageStepDef {
	TeamPage teamPage = new TeamPage();
	SigninPage loginPage = new SigninPage();
	
	@Then("go to the team page")
	public void go_to_the_team_page() {
		BrowserUtils.fluentWait(loginPage.myButton, 10);
		loginPage.myButton.click();
		loginPage.teamButton.click();
	}

	@Then("users team name {string} should be displayed")
	public void users_team_name_should_be_displayed(String teamNames) {
		
		BrowserUtils.waitFor(2);
		assertEquals( teamNames, teamPage.teamName.getText());


	}
	
	@Then("user should sign off")
	public void user_should_sign_off() {
		BrowserUtils.waitFor(1);
		loginPage.myButton.click();
		loginPage.signoutButton.click();
	}
	
	@Then("verify {string} many team members users have")
	public void verify_many_team_members_users_have(String number) {
		BrowserUtils.waitFor(3);
		int actual= teamPage.teamMemberNames.size();
	    int expected= Integer.parseInt(number);
	    assertEquals(expected, actual);
	}

	@Then("verify users fullname {string} {string} is in the team members")
	public void verify_users_fullname_is_in_the_team_members(String firstName, String lastName) {
		BrowserUtils.waitFor(3);

		assertTrue(teamPage.isUserIncluded(firstName, lastName));
		
	}
	
}
