Feature: Sign in as Team Lead


Scenario Outline: sign in as team-lead  
	Given the user is on the login page 
	When the user enters username "<email>" 
	Then the user enters "<firstname>" "<lastname>" as password 
	And go to the self page
	Then users full name should be displayed 
	
	Examples: 
		|firstname 	|lastname  		|email 						|    
		|Teri		|Mapam			|jalabaster7f@drupal.org	|
		|Ruthann	|Johnes			|daldie7l@seattletimes.com	|
		|Arluene	|Reolfo			|gmcalister7n@google.nl		|
		|Bred		|Penhalurick	|apobred@hotmailmail.com	|
		|Leonard	|Warfield		|sutting7v@liveinternet.ru	|
		|Hadley		|Climer			|finkles7z@studiopress.com	|
		|Carlos		|Michie			|strayford84@e-recht24.de	|
		|Garrik		|Heis			|cbrose86@cbslocal.com		|
		