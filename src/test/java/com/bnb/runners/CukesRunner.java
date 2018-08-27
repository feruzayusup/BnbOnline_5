package com.bnb.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {
				"pretty",
				"html:target/default-cucumber-reports",
				"json:target/cucumber.json"
		
		},
		
		tags="@mehmet",
		features="src/test/resources/com.bnb/features", 
		glue="com/bnb/step_definitions"
//		,dryRun = true
		)
public class CukesRunner {
	
	
	
}

