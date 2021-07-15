package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.utlil.BaseConfig;

public class DriverManager {
	
	public   WebDriver getDriver() {
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.navigate().to(BaseConfig.getData("URL"));
		driver.manage().window().maximize();
		
		return driver;
		
	}
	
	
}