Feature: Check if the correct team name is displayed

Scenario: See Team name
	Given the user is on the home page
	When the user enters "Username" and "password"
	Then the user clicks on the My Team
	Then correct team name should be displyed on the page