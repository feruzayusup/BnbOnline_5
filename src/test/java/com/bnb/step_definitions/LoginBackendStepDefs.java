package com.bnb.step_definitions;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.Map;

import com.bnb.pages.SelfPage;
import com.bnb.pages.SigninPage;
import com.bnb.utilities.BrowserUtils;
import com.bnb.utilities.ConfigurationReader;
import com.bnb.utilities.DBUtils;
import com.bnb.utilities.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginBackendStepDefs {
	SigninPage signInPage=new SigninPage();
	SelfPage selfPage = new SelfPage();
	
	@Given("user logs in using {string} {string}")
	public void user_logs_in_using(String username, String password) {
		Driver.getDriver().get(ConfigurationReader.getProperty("url"));
		BrowserUtils.waitFor(2);
		signInPage.emailField.sendKeys(username);
		signInPage.passwordField.sendKeys(password);
		signInPage.signinButton.click();
		BrowserUtils.waitFor(5);
	}

	@When("the user is on the my self page")
	public void the_user_is_on_the_my_self_page() {
		signInPage.myButton.click();
		BrowserUtils.waitFor(2);
		signInPage.selfButton.click();
		BrowserUtils.waitFor(2);
	}

	@Then("user info should match the db records using {string}")
	public void user_info_should_match_the_db_records_using(String email) {
		String sql = "select firstname, lastname, role from users where email ='" + email + "';";
		System.out.println(sql);
		List<Map<String, Object>> result = DBUtils.getQueryResultMap(sql);
		
		assertEquals("More than 1 user with this email " + email, 1, result.size());

		Map<String, Object> map = result.get(0);
		
		String expectedFirstName = (String) map.get("firstname");
		String expectedLastName = (String) map.get("lastname");
		String expectedRole = (String) map.get("role");
		BrowserUtils.waitFor(2);
		
		String fname=selfPage.name.getText();
		String[] fullName = fname.split(" ");
		String aRole = selfPage.role.getText();

		assertEquals(expectedFirstName, fullName[0]);
		assertEquals(expectedLastName, fullName[1]);
		assertEquals(expectedRole, aRole);

	}


}
