Feature: Team page has correct info

#@mehmet
Scenario Outline: See Team name

	Given the user is on the login page 
	When the user enters username "<email>" 
	Then the user enters "<firstname>" "<lastname>" as password 
	And go to the team page
	Then users team name "<teamName>" should be displayed 
	And user should sign off
	
	Examples: 
		|firstname 	|lastname  		|email 						|teamName 	|  
		|Christophe	|Flory			|gmalkin7j@mail.ru			|CodeHunters|
		|Arluene	|Reolfo			|gmcalister7n@google.nl		|Spark		|
		|Bred		|Penhalurick	|apobred@hotmailmail.com	|Django		|
		|Hadley		|Climer			|finkles7z@studiopress.com	|Microsoft	|
		|Teri		|Mapam			|jalabaster7f@drupal.org	|TheCrew	|

#@mehmet		
Scenario Outline: Check how many team members user have in the team
	Given the user is on the login page 
	When the user enters username "<email>" 
	Then the user enters "<firstname>" "<lastname>" as password 
	And go to the team page
	Then verify "<teamSize>" many team members users have
	And user should sign off
	
	Examples: 
		|firstname 	|lastname  		|email 						|teamSize 	|  
		|Christophe	|Flory			|gmalkin7j@mail.ru			|4			|
		|Arluene	|Reolfo			|gmcalister7n@google.nl		|4			|
		|Bred		|Penhalurick	|apobred@hotmailmail.com	|4			|
		|Hadley		|Climer			|finkles7z@studiopress.com	|3			|
		|Teri		|Mapam			|jalabaster7f@drupal.org	|5			|

@mehmet	
Scenario Outline: Check if the user is listed in the team
	Given the user is on the login page 
	When the user enters username "<email>" 
	Then the user enters "<firstname>" "<lastname>" as password 
	And go to the team page
	Then verify users fullname "<firstname>" "<lastname>" is in the team members
	And user should sign off
	
	Examples: 
		|firstname 	|lastname  		|email 						|  
		|Christophe	|Flory			|gmalkin7j@mail.ru			|
		|Arluene	|Reolfo			|gmcalister7n@google.nl		|
		|Bred		|Penhalurick	|apobred@hotmailmail.com	|
		|Hadley		|Climer			|finkles7z@studiopress.com	|
		|Teri		|Mapam			|jalabaster7f@drupal.org	|		

		