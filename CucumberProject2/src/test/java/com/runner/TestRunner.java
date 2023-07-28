package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.base.JVMReport;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features\\Task.feature",glue="com.stepdefination", dryRun=false, monochrome=true,
 plugin= {"pretty","junit:target/cucumber-reports/report.xml",
		 "html:target/cucumber-reports/report.html",
		 "json:target/cucumber-reports/report.json"})


public class TestRunner {
	
	@AfterClass
	public static void afterClass() {
		
		JVMReport.generateJVMReport("C:\\Users\\utham\\eclipse-workspace\\CucumberProject1\\target\\cucumber-reports");
		
	}
	
	}


