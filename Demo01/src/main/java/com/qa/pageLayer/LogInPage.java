package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class LogInPage extends TestBase{

	public LogInPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='username']")
	private WebElement username;
	
	public void enterUsername(String Username)
	{
		username.sendKeys(Username);
	}
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement password;
	
	public void enterPassword(String Password)
	{
		password.sendKeys(Password);
	}
	
	@FindBy(xpath="//li[@id='Inpatient Ward']")
	private WebElement location;
	
	public void selectLocationForTheSession()
	{
		location.click();
	}
	
	@FindBy(xpath="//input[@id='loginButton']")
	private WebElement logIn;
	
	public void clickOnLogInButton()
	{
		logIn.click();
	}
	
}
