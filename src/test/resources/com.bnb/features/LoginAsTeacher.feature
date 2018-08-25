Feature: Sign in as teacher


Scenario Outline: login as teacher
	Given the user is on the login page 
	When the teacher enters username "<email>" 
	Then the teacher enters "<firstname>" "<lastname>" as password 
	And go to the self page
	Then users full name should be displayed 
	
	Examples: 
	|firstname 	|lastname  	|email 			 |  
	|Mark		|Wohlberg	|teacherva4@gmail.com|
	|Max		|Payne		|teacherva5@gmail.com|
	|Sergey		|Brin		|teacherva6@gmail.com|