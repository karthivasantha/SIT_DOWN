package org.adactinrunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.report.JVMreport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features\\Login.feature", glue="org.Stepdefinitionadactin",
plugin={ "pretty",
		"html:src\\test\\resources\\adactinreport",
		"json:src\\test\\resources\\adactinreport\\fb.json", 
		"rerun:src\\test\\resources\\rerun\\failed1.txt"})


public class Adactinrunner {
	
@AfterClass
public static void ac1() {
	JVMreport.JVMReportGeneration(System.getProperty("user.dir")+"\\src\\test\\resources\\adactinreport\\fb.json");
}
}
