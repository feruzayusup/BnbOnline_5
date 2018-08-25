	@schedulePage 
Feature: Checking schedule by user priveleges 

Scenario Outline: Check schedule as a team lead 
	Given the user is on the login page 
	When the user enters username "<email>" 
	Then the user enters "<firstname>" "<lastname>" as password 
	And the user clicks on schedule tab 
	Then the schedule page is displayed 
	Then the user clicks on first reservation 
	Then the user should be able to see the cancel reservation option 
	Given the user is on the home page 
	Then the user signs out 
	
	Examples: 
		|firstname 	|lastname  		|email 						|    
		|Teri		|Mapam			|jalabaster7f@drupal.org	|
		
		
Scenario Outline: Check schedule as a tecaher 
	Given the user is on the login page 
	When the user enters username "<email>" 
	Then the user enters "<firstname>" "<lastname>" as password 
	And the user clicks on schedule tab 
	Then the schedule page is displayed 
	Then the user clicks on first reservation 
	Then the user should be able to see the cancel reservation option 
	Given the user is on the home page 
	Then the user signs out 
	
	Examples: 
		|firstname 	|lastname  	|email 			 |  
		|Mark		|Wohlberg	|teacherva4@gmail.com|
	
Scenario Outline: Check schedule as a student 
	Given the user is on the login page 
	When the user enters username "<email>" 
	Then the user enters "<firstname>" "<lastname>" as password 
	And the user clicks on schedule tab 
	Then the schedule page is displayed 
	Then the user clicks on first reservation 
	Then the user should not be able to see the cancel reservation option 
	Given the user is on the home page 
	Then the user signs out 
	Examples: 
		|firstname 	|lastname  		|email 						|    
		|Angie		|Coatham		|sdarben7g@alibaba.com		|
			