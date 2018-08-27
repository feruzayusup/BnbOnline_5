Feature: Login funtionality back end test


@db @temp
Scenario: my self 
	Given user logs in using "jalabaster7f@drupal.org" "terimapam" 
	When the user is on the my self page 
	Then user info should match the db records using "jalabaster7f@drupal.org" 
	