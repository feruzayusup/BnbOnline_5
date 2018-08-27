package com.bnb.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.bnb.utilities.Driver;

public class TeamPage {
	public TeamPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(className="subtitle")
	public WebElement teamName;
	
	@FindBy(className="title")
	public WebElement title;
	
	@FindBy(xpath="//p[.='name']/preceding-sibling::p[@class='title is-6']")
	public List<WebElement> teamMemberNames;

	@FindBy(xpath="//p[.='role']/preceding-sibling::p[@class='title is-6']")
	public List<WebElement> teamMemberRoles;
	
	
	public boolean isUserIncluded(String firstName, String lastName) {
		String fullName= firstName+" "+lastName;
		
		for (WebElement webElement : teamMemberNames) {
			if(webElement.getText().equals(fullName))
				return true;
		}
		
		return false;
		
		
	}
	
}
