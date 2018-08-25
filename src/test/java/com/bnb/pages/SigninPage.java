package com.bnb.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bnb.utilities.BrowserUtils;
import com.bnb.utilities.Driver;

public class SigninPage {

	public SigninPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(name = "email")
	public WebElement emailField;

	@FindBy(name = "password")
	public WebElement passwordField;

	@FindBy(xpath = "//button[.='sign in']")
	public WebElement signinButton;

	@FindBy(xpath = "//a[.='my']")
	public WebElement myButton;

	@FindBy(xpath = "//a[.='self']")
	public WebElement selfButton;

	@FindBy(xpath = "//h2[@class='subtitle']")
	public WebElement title;

	@FindBy(xpath = "//a[.='sign out']")
	public WebElement signoutButton;
	
	@FindBy(xpath = "//div[@class='cdk-live-announcer-element cdk-visually-hidden']")
	public WebElement errorMessage;
	
	
	
	  public void login(String email, String password ) {
		  emailField.sendKeys(email);
		  passwordField.sendKeys(password);
		  signinButton.click();
		  BrowserUtils.waitFor(5);
		 
	  }
	
	

}
