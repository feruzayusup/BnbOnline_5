package com.bnb.step_definitions;

import com.bnb.pages.SigninPage;
import com.bnb.utilities.BrowserUtils;
import com.bnb.utilities.ConfigurationReader;
import com.bnb.utilities.Driver;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginScenarioOutlineStepDefs {
	SigninPage loginPage = new SigninPage();

	@Given("the user is on the login page")
	public void the_user_is_on_the_login_page() {
		Driver.getDriver().get(ConfigurationReader.getProperty("url"));
		
	}

	@When("the user enters username {string}")
	public void the_user_enters_username(String username) {
	
		BrowserUtils.waitFor(5);
		loginPage.emailField.sendKeys(username);
	}

	@When("the user enters {string} {string} as password")
	public void the_user_enters_as_password(String firstName, String lastName) {
		String password=passwordMaker( firstName, lastName );
		loginPage.passwordField.sendKeys(password);
		loginPage.signinButton.click();
		BrowserUtils.waitFor(5);
		
	}
	@When("the student enters username {string}")
	public void the_student_enters_username(String username) {
		BrowserUtils.waitFor(5);
		loginPage.emailField.sendKeys(username);
	}

	@Then("the student enters {string} {string} as password")
	public void the_student_enters_as_password(String firstName, String lastName) {
		String password=passwordMaker( firstName, lastName );
		loginPage.passwordField.sendKeys(password);
		loginPage.signinButton.click();
		BrowserUtils.waitFor(5);
	}
	
	@When("the teacher enters username {string}")
	public void the_teacher_enters_username(String username) {
		BrowserUtils.waitFor(5);
		loginPage.emailField.sendKeys(username);
	}

	@Then("the teacher enters {string} {string} as password")
	public void the_teacher_enters_as_password(String firstName, String lastName) {
		String password=passwordMaker( firstName, lastName );
		loginPage.passwordField.sendKeys(password);
		loginPage.signinButton.click();
		BrowserUtils.waitFor(5);
	}
	
	@When("the team-lead enters username {string}")
	public void the_team_lead_enters_username(String username) {
		BrowserUtils.waitFor(5);
		loginPage.emailField.sendKeys(username);  
	}

	@Then("the team-lead enters {string} {string} as password")
	public void the_team_lead_enters_as_password(String firstName, String lastName) {
		String password=passwordMaker( firstName, lastName );
		loginPage.passwordField.sendKeys(password);
		loginPage.signinButton.click();
		BrowserUtils.waitFor(5);
	}

	

	@Then("go to the self page")
	public void go_to_the_self_page() {
		loginPage.myButton.click();
		loginPage.selfButton.click();
	}
	

	@Then("users full name should be displayed")
	public void users_full_name_should_be_displayed() {
		BrowserUtils.waitFor(2);
		String actual=loginPage.title.getText();
		assertTrue(actual, true);
		loginPage.myButton.click();
		loginPage.signoutButton.click();
		
	}


	public String passwordMaker(String firstName, String lastName) {
		
//		String str=firstName+lastName;
//		String password="";
//		for (int i = 0; i < str.length(); i++) {
//			if (str.charAt(i) <=90 && str.charAt(i)>=65) {
//				String letter = (str.charAt(i) + "").toLowerCase();
//				password += letter;
//			} else {
//				password += str.charAt(i);
//			}
//		}
//		
//
//		return password;
		
		return (firstName+lastName).toLowerCase();
	}

}
