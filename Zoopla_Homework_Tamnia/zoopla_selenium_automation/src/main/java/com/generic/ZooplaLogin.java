package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.utlil.BaseConfig;
import com.utlil.Highlighter;
import com.utlil.Screenshot;

public class ZooplaLogin {
	public   Masterpagefactory baseLogin(WebDriver driver) {
		
Masterpagefactory obj=new Masterpagefactory (driver);
Highlighter.addColor(driver, obj.getAcceptallcookies());

Screenshot.getScreenShot(driver, "Home Page");
obj.getAcceptallcookies().click();
//obj.getSigninbutton().click();
Highlighter.addColor(driver, obj.getEmail());
obj.getEmail().sendKeys(BaseConfig.getData("User"));
Highlighter.addColor(driver, obj.getPassword());
obj.getPassword().sendKeys(BaseConfig.getData("Password"));
Screenshot.getScreenShot(driver, "Signin  Page");
obj.getSigninbutton2().click();

try {
	Thread.sleep(3000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}


Actions ac=new Actions(driver);

ac.moveToElement(obj.getMyzooplabtn()).build().perform();

if(obj.getSignoutbutton().isDisplayed()) {
	System.out.println("Login passed");
}else{
	System.out.println("Login failed");
	
}

//obj.getSignoutbutton().click();



return obj;	
	
	}

}
