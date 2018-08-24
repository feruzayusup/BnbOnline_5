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

	

	@When("the user signs in with valid username and password")
	public void the_user_signs_in_with_valid_username_and_password() {
		String fileLocation = TestConstants.TEST_DATA_FOLDER + "batch8-light (3).xlsx";
		ExcelUtil excelObject = new ExcelUtil(fileLocation, "Sheet1");

		List<Map<String, String>> dataList = excelObject.getDataList();
		
		for (Map<String, String> row : dataList) {
			String password = passwordMaker(row.get("first_name"), row.get("last_name"));
			String email=row.get("email");
			loginPage.login(email, password);
			
			loginPage.myButton.click();
			BrowserUtils.waitFor(2);

			loginPage.signoutButton.click();
			BrowserUtils.waitFor(2);

		}

	}

	public String passwordMaker(String firstName, String lastName) {
		
		String str=firstName+lastName;
		String password="";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) <=90 && str.charAt(i)>=65) {
				String letter = (str.charAt(i) + "").toLowerCase();
				password += letter;
			} else {
				password += str.charAt(i);
			}
		}
		

		return password;
	}

	@Then("verify the user information displayed in self menu")
	public void verify_the_user_information_displayed_in_self_menu() {

		String fileLocation = TestConstants.TEST_DATA_FOLDER + "batch8-light (3).xlsx";
		ExcelUtil excelObject = new ExcelUtil(fileLocation, "Sheet1");

		List<Map<String, String>> dataList = excelObject.getDataList();
		
		for (Map<String, String> row : dataList) {

			String password = passwordMaker(row.get("first_name"), row.get("last_name"));
			String email=row.get("email");
			loginPage.login(email, password);

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
