package com.base;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVMReport {
	public static  void generateJVMReport(String jsonFile) {
		File reportLoc = new File("C:\\Users\\utham\\eclipse-workspace\\CucumberProject1\\target\\cucumber-reports\\report.html");
		
		// To set the configuration
		Configuration con = new Configuration(reportLoc, "PRO");
		
		// To get the configuration
		con.addClassifications("Platform", "Windows 10");
		con.addClassifications("Sprint", "1");
		con.addClassifications("Author", "uthama");
		
		List<String> jsonReportFile = new LinkedList<String>();
		jsonReportFile.add(jsonFile);
		
		ReportBuilder builder = new ReportBuilder(jsonReportFile, con);
		builder.generateReports();
	}

}
