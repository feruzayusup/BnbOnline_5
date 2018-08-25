Feature: Signing in with invalid password
@temp
Scenario Outline: Verify error message 
	Given the user is on the login page 
	When the user enters username "<email>" 
	Then the user enters "invalidpassword" as password 
	And the message "invalid password." should appear
		Examples: 
 		|email 						|    
        |jalabaster7f@drupal.org	|
		|sdarben7g@alibaba.com		|
		|aneagle7h@miibeian.gov.cn	|
		|ewrist7i@livejournal.com	|
		|gmalkin7j@mail.ru			|
		|vtugman7k@joomla.org		|
		|daldie7l@seattletimes.com	|
		|rkernocke7m@cnet.com		|
		|gmcalister7n@google.nl		|
		|uvalerio7o@google.com		|
		|bczadla7p@uol.com.br		|
		|ehegel7q@usatoday.com		|
		|apobred@hotmailmail.com	|
		|asolon7s@pinterest.com		|
		|kodonnelly7t@bigcartel.com |
		|jhelkin7u@hao123.com		|
		|sutting7v@liveinternet.ru	|
		|nshearsby7w@uiuc.edu		|
		|dcranstoun7x@sina.com.cn	|
		|ucharlot7y@nbcnews.com		|
		|finkles7z@studiopress.com	|
		|fklampt80@seesaa.net		|
		|bcircuit81@whitehouse.gov	|
		|marblaster82@patch.com		|
		|csummergill83@blinklist.com|
		|strayford84@e-recht24.de	|
		|filieve85@amazon.de		|
		|cbrose86@cbslocal.com		|
		|kpenvarne87@w3.org			|
		|bcrosetti88@sitemeter.com	|
		|teacherva4@gmail.com		|
		|teacherva5@gmail.com		|
		|teacherva6@gmail.com		|	