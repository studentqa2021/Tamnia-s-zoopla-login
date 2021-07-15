package com.smoke;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.generic.DriverManager;
import com.generic.Masterpagefactory;
import com.generic.ZooplaLogin;

public class Zooplarun {
	static WebDriver driver;
	static ExtentReports extent;
	ExtentTest test;
	WebDriver driver2;
	@BeforeTest
	public void setup() {
		ExtentSparkReporter repoter = new ExtentSparkReporter("target/Zoopla.ExtendsTestNGReport.html");
		repoter.config().setDocumentTitle("Zoopla hw Selenium");
		repoter.config().setReportName("loginTest Test");
		repoter.config().setTheme(Theme.STANDARD);
		extent = new ExtentReports();
		extent.attachReporter(repoter);
		extent.setSystemInfo("Company ", "SMART TECH");
		extent.setSystemInfo("Testing environment ", "QA");
		extent.setSystemInfo("Team ", "QA");
		extent.setSystemInfo("Tester Name: ", System.getProperty("user.name"));
		
		 driver2 = new	DriverManager(). getDriver();
		
	}
	
@Test
public void loginTest() {
	
	Masterpagefactory obj =new ZooplaLogin().baseLogin(driver2);
	
}
@AfterTest // close/quit
public void teardown() {
	extent.flush();
	//driver2.quit();
}
}
