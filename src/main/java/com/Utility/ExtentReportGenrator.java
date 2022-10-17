package com.Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGenrator {
	
	public static ExtentReports extent;
	public static ExtentReports getReports() {
		
		// ExtentSparkReporter --> 
		//ExtentReports 
		String reportPath="D:\\Batch_13E_Framework\\Reports\\index.html";
		
		ExtentSparkReporter reporter=new ExtentSparkReporter(reportPath);
		reporter.config().setDocumentTitle("AutomationTest Report");
		reporter.config().setReportName("Batch 13 Evening Test Report");
		reporter.config().setTheme(Theme.DARK);
		
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		
		extent.setSystemInfo("ProjectName ", "Batch 13 Project");
		extent.setSystemInfo("Module", "Automation Test Module");
		extent.setSystemInfo("Tool", "Selenium");
		extent.setSystemInfo("QA Name", "Govind");
		return extent;
		
		
		
	}

}
