package com.utlil;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Highlighter {
	public static void addColor(WebDriver driver, WebElement element){
		
JavascriptExecutor obj = (JavascriptExecutor)driver; //type casting
obj.executeScript("arguments[0].setAttribute('style', arguments[1]);",element, "color: red; border: 2px solid red;");
	
	}



}
