Feature: Room hunting as a teacher

Scenario: user is on login page
	Given the user is on the login page 
	When the user signs in with valid username and password 
	Then the user clicks on hunt button 
 	And verify the user is on hunt for spot page
 	
Scenario: user chooses DATE on drop down menu
	Given the user is on hunt for spot page
	When the user clicks on date drop down
 	Then the user should be able to see a calendar
 	Then the user should be able to choose available dates
  	
Scenario: user chooses TIME on drop down menu
	Given the user is on hunt for spot page
	When the user clicks time drop down
 	Then the user should be able to see time options from and to
 	Then the user should be able to choose time
 	And the user clicks on search button
 	Then the user should be able to see free spots page

Scenario: user is on Free Spots Page
	Given the user is on free spots page
	When the user clicks book button under harvard box
 	Then the user should land on booking confirmation page
 	
Scenario: user is on Booking Confirmation Page
	Given the user is on booking confirmation page
	When the user clicks confirm button 
 	Then the user should land on schedule page
 	
Scenario: user is on Schedule Page
	Given the user is on schedule page
	Then the user should be able to see the correct name
	And the user should be able to see scheduled room with correct time and date