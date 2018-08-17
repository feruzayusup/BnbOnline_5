Feature: Login 

@temp 
Scenario: login with valid credentials
	Given the user is on the login page 
	When the user signs in with valid username and password 
 	Then verify the user information displayed in self menu