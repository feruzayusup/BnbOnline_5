package com.bnb.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bnb.utilities.Driver;

public class SelfPage {

		public SelfPage() {
			PageFactory.initElements(Driver.getDriver(), this);
		}


		@FindBy(xpath = "(//*[@class='title is-6'])[1]")
		public WebElement name;

		@FindBy(xpath = "(//*[@class='title is-6'])[2]")
		public WebElement role;

		@FindBy(xpath = "(//*[@class='title is-6'])[3]")
		public WebElement team;

}
