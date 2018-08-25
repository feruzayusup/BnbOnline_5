package com.bnb.step_definitions;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import javax.security.auth.login.Configuration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.bnb.pages.SchedulePage;
import com.bnb.utilities.BrowserUtils;
import com.bnb.utilities.ConfigurationReader;
import com.bnb.utilities.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class SchedulePageStepDef {
	SchedulePage schedulePage = new SchedulePage();
		
	@Then("the user clicks on schedule tab")
	public void the_user_clicks_on_schedule_tab() {
		schedulePage.scheduleLink.click();
		BrowserUtils.waitFor(3);
	}

	@Then("the schedule page is displayed")
	public void the_schedule_page_is_displayed() {
	  schedulePage.schudulePageTite.isDisplayed();
	  BrowserUtils.waitFor(3);
	}

	@Then("the user clicks on first reservation")
	public void the_user_clicks_on_first_reservation() {
		System.out.println( "Total Reservations: "+schedulePage.reservations.size());
		BrowserUtils.waitFor(3);
		schedulePage.reservations.get(0).click();
		BrowserUtils.waitFor(3);
			}

	@Then("the user should be able to see the cancel reservation option")
	public void the_user_should_be_able_to_see_the_cancel_reservation_option() {
		assertTrue(schedulePage.cancelReservationButton.isDisplayed());
		System.out.println("Button: "+schedulePage.cancelReservationButton.getText()+" is visble"); 
		BrowserUtils.waitFor(3);
	}
	@Then("the user should not be able to see the cancel reservation option")
	public boolean the_user_should_not_be_able_to_see_the_cancel_reservation_option() {
		
		BrowserUtils.waitFor(3);
		 try {
			   boolean btnPresence = schedulePage.cancelReservationButton.isDisplayed();
			     }
			   catch (org.openqa.selenium.NoSuchElementException e){
				   System.out.println("Cance Reservation button is not visible for student."); 
			          return false;
			      }
    return true;
			  }
	
	@Then("the user signs out")
	public void the_user_signs_out() {
		BrowserUtils.waitFor(3);
		
		Actions builder  = new Actions(Driver.getDriver());
		builder.moveToElement(schedulePage.navbarLink)
		.click(schedulePage.signOutButton).build().perform();
		BrowserUtils.waitFor(3);
		
	}
	@Given("the user is on the home page")
	public void the_user_is_on_the_home_page() {
	    Driver.getDriver().get(ConfigurationReader.getProperty("url"));
	}
	
}
