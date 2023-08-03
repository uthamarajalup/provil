package org.runner;

import org.base.JVMReport;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Feature\\Response.feature", glue = "org.step", dryRun = true, monochrome = true, plugin = {
		"pretty", "junit:target/cucumber-reports/report.xml", "html:target/cucumber-reports/report.html",
		"json:target/cucumber-reports/report.json" })

public class TestRunner {
	@AfterClass
	public static void afterClass() {

		JVMReport.generateJVMReport("C:\\Users\\utham\\eclipse-workspace\\ApiTestingResponse\\target\\cucumber-reports");

	}
}
