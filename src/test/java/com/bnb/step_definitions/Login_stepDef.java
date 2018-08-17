package com.bnb.step_definitions;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.Map;

import com.bnb.pages.SigninPage;
import com.bnb.utilities.BrowserUtils;
import com.bnb.utilities.ConfigurationReader;
import com.bnb.utilities.Driver;
import com.bnb.utilities.ExcelUtil;
import com.bnb.utilities.TestConstants;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login_stepDef {

	SigninPage loginPage = new SigninPage();

	@Given("the user is on the login page")
	public void the_user_is_on_the_login_page() {
		Driver.getDriver().get(ConfigurationReader.getProperty("url"));
	}

	@When("the user signs in with valid username and password")
	public void the_user_signs_in_with_valid_username_and_password() {
		String fileLocation = TestConstants.TEST_DATA_FOLDER + "batch8-light.xlsx";
		ExcelUtil excelObject = new ExcelUtil(fileLocation, "Sheet1");

		List<Map<String, String>> dataList = excelObject.getDataList();
		
		for (Map<String, String> row : dataList) {

			loginPage.emailField.sendKeys(row.get("email"));

			String password = passwordMaker(row.get("first_name"), row.get("last_name"));
			loginPage.passwordField.sendKeys(password);

			loginPage.signinButton.click();
			BrowserUtils.waitFor(5);

			loginPage.myButton.click();
			BrowserUtils.waitFor(2);

			loginPage.signoutButton.click();
			BrowserUtils.waitFor(2);

		}

	}

	public String passwordMaker(String firstName, String lastName) {

		String first = (firstName.substring(0, 1)).toLowerCase() + firstName.substring(1);
		String last = (lastName.substring(0, 1)).toLowerCase() + lastName.substring(1);
		String lastNameLowerCase = "";
		String firstNameLowerCase = "";

		for (int i = 0; i < first.length(); i++) {
			if (first.charAt(i) < 91) {
				String letter = (first.charAt(i) + "").toLowerCase();
				firstNameLowerCase += letter;
			} else {
				firstNameLowerCase += first.charAt(i);
			}
		}
		for (int i = 0; i < last.length(); i++) {
			if (last.charAt(i) < 91) {
				String letter = (last.charAt(i) + "").toLowerCase();
				lastNameLowerCase += letter;
			} else {
				lastNameLowerCase += last.charAt(i);
			}
		}

		String password = firstNameLowerCase + lastNameLowerCase;
		System.out.println(password);

		return password;
	}

	@Then("verify the user information displayed in self menu")
	public void verify_the_user_information_displayed_in_self_menu() {

		String fileLocation = TestConstants.TEST_DATA_FOLDER + "batch8-light.xlsx";
		ExcelUtil excelObject = new ExcelUtil(fileLocation, "Sheet1");

		List<Map<String, String>> dataList = excelObject.getDataList();
		
		for (Map<String, String> row : dataList) {

			loginPage.emailField.sendKeys(row.get("email"));

			String password = passwordMaker(row.get("first_name"), row.get("last_name"));
			loginPage.passwordField.sendKeys(password);

			loginPage.signinButton.click();
			BrowserUtils.waitFor(5);

			loginPage.myButton.click();
			BrowserUtils.waitFor(2);

			loginPage.selfButton.click();
			BrowserUtils.waitFor(2);

			String actual = loginPage.title.getText();
			String expected = row.get("first_name") + " " + row.get("last_name");

			assertEquals(expected, actual);

			loginPage.myButton.click();
			BrowserUtils.waitFor(2);

			loginPage.signoutButton.click();
			BrowserUtils.waitFor(2);

		}

	}

}
