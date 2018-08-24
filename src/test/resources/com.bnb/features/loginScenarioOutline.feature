Feature: Sign in functionality with scenario outline

@temp 
Scenario Outline: Verify usernames 
	Given the user is on the login page 
	When the user enters username "<email>" 
	Then the user enters "<firstname>" "<lastname>" as password 
	And go to the self page
	Then users full name should be displayed 
	
	Examples: 
		|firstname 	|lastname  		|email 						|    
		|Teri		|Mapam			|jalabaster7f@drupal.org	|
		|Angie		|Coatham		|sdarben7g@alibaba.com		|
		|Bennett	|Tomanek		|aneagle7h@miibeian.gov.cn	|
		|Mariann	|Dewi			|ewrist7i@livejournal.com	|
		|Christophe	|Flory	    	|gmalkin7j@mail.ru			|
		|Daryle	    |Dikles			|vtugman7k@joomla.org		|
		|Ruthann	|Johnes			|daldie7l@seattletimes.com	|
		|Merrilee	|Ambler			|rkernocke7m@cnet.com		|
		|Arluene	|Reolfo			|gmcalister7n@google.nl		|
		|Sharai		|Pencot			|uvalerio7o@google.com		|
		|Humphrey	|Alsop			|bczadla7p@uol.com.br		|
		|Nefen		|Yong			|ehegel7q@usatoday.com		|
		|Bred		|Penhalurick	|apobred@hotmailmail.com	|
		|Rozamond	|Hellard		|asolon7s@pinterest.com		|
		|Roberta	|Murrison		|kodonnelly7t@bigcartel.com |
		|Stanton	|Matus			|jhelkin7u@hao123.com		|
		|Leonard	|Warfield		|sutting7v@liveinternet.ru	|
		|Lorette	|Bradnum		|nshearsby7w@uiuc.edu		|
		|Durant		|Dominey		|dcranstoun7x@sina.com.cn	|
		|Archibald	|Melloy			|ucharlot7y@nbcnews.com		|
		|Hadley		|Climer			|finkles7z@studiopress.com	|
		|Timothea	|Meade			|fklampt80@seesaa.net		|
		|Heinrik	|Summersett		|bcircuit81@whitehouse.gov	|
		|Rosanne	|Loadman		|marblaster82@patch.com		|
		|Edy		|Caton			|csummergill83@blinklist.com|
		|Carlos		|Michie			|strayford84@e-recht24.de	|
		|Francesca	|Gowing			|filieve85@amazon.de		|
		|Garrik		|Heis			|cbrose86@cbslocal.com		|
		|Marian		|Spinley		|kpenvarne87@w3.org			|
		|James		|McDonagh		|bcrosetti88@sitemeter.com	|
		|Mark		|Wohlberg		|teacherva4@gmail.com		|
		|Max		|Payne			|teacherva5@gmail.com		|
		|Sergey		|Brin			|teacherva6@gmail.com		|	