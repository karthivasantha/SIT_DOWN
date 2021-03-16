package org.adactinrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"@src\\test\\resources\\rerun\\failed1.txt"},glue= {"org.Stepdefinitionadactin"}, dryRun=false,
plugin={ "pretty",
		"html:src\\test\\resources\\adactinreport",
		"json:src\\test\\resources\\adactinreport\\fb.json", 
		"rerun:src\\test\\resources\\rerun\\failed1.txt"})


public class Testrerunner {

}

