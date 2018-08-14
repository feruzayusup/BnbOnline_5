package com.bnb.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bnb.utilities.Driver;

public class HomePage {

  public HomePage() {
    PageFactory.initElements(Driver.getDriver(), this);
  }

  @FindBy(xpath = "//input[@name='email']")
  public WebElement username;

  @FindBy(xpath = "//input[@name='password']")
  public WebElement password;

  @FindBy(xpath = "//button[@type='submit']")
  public WebElement signInButton;
  
  public void login(String uName, String pWord ) {
	  username.sendKeys(uName);
	  password.sendKeys(pWord);
	  signInButton.click();
  }
}
