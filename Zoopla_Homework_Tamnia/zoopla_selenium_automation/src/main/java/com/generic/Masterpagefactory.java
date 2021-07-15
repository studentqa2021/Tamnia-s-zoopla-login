package com.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Masterpagefactory {
	public Masterpagefactory(WebDriver driver) {// to remove null pointer exception
		PageFactory.initElements(driver, this);
	}


	@FindBy(xpath = "(//*[contains(text(),'Accept all cookies')])[2]")
	private WebElement acceptallcookies;
	
	@FindBy(xpath = "(//*[contains(@class,'css-18xug1d-ButtonLink-Button-ButtonLinkWithIcon et03gpj0')])[4]")
	private WebElement Signinbutton;
	
	
	@FindBy(xpath = "//*[@name='email']")
	private WebElement email;
	
	@FindBy(xpath = "//*[@name='password']")
	private WebElement password;
	
	@FindBy(xpath = "(//*[contains(text(),'Sign in')])[10]")
	private WebElement signinbutton2;
	
	@FindBy(xpath =  "(//*[contains(@class,'css-18ufi8 e1niaah3')])[1]")
	private WebElement Myzooplabtn;

	@FindBy(xpath = "(//*[contains(@class,'layout-standard-flipped myaccount')])[2]")
	private WebElement Signoutbutton;

	public WebElement getAcceptallcookies() {
		return acceptallcookies;
	}

	public WebElement getSigninbutton() {
		return Signinbutton;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSigninbutton2() {
		return signinbutton2;
	}

	public WebElement getMyzooplabtn() {
		return Myzooplabtn;
	}

	public WebElement getSignoutbutton() {
		return Signoutbutton;
	}




}