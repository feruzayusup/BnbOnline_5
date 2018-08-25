package com.bnb.step_definitions;

import com.bnb.pages.SigninPage;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import com.bnb.utilities.BrowserUtils;

import cucumber.api.java.en.Then;

public class LoginNegativeStepDefs {

	SigninPage loginPage=new SigninPage();
	
	@Then("the user enters {string} as password")
	public void the_user_enters_as_password(String password) {
		loginPage.passwordField.sendKeys(password);
		loginPage.signinButton.click();
		BrowserUtils.waitFor(5);
		
	  
	}

	@Then("the message {string} should appear")
	public void the_message_should_appear(String errorMessage) {
		String actual=loginPage.errorMessage.getText();
		String expected=errorMessage;
		assertEquals(expected, actual);
		loginPage.emailField.clear();
		loginPage.passwordField.clear();		
	  
	}

	
	
}
