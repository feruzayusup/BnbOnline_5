package com.bnb.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
	
	
	  public void login(String username, String password ) {
		  emailField.sendKeys(username);
		  passwordField.sendKeys(password);
		  signinButton.click();
		 
	  }
	
	

}
