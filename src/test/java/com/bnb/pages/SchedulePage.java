package com.bnb.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bnb.utilities.Driver;

public class SchedulePage {
	
	public SchedulePage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(xpath="//a[@href='/schedule/my']")
	public WebElement scheduleLink;
	
	@FindBy(xpath="//*[@class='title']")
	public WebElement schudulePageTite;
	
	//@FindBy(xpath="//td[@class='conference']")
	@FindBy(className="conference")
	public List< WebElement> reservations;
	
	@FindBy(className="conference ng-star-inserted")
	public WebElement scheduledTime;
	
	@FindBy(xpath="//button[@class='button is-danger']")
	public WebElement cancelReservationButton;
	
	@FindBy(className="navbar-link")
	public WebElement navbarLink;
	
	@FindBy(linkText="sign out")
	public WebElement signOutButton;
}
