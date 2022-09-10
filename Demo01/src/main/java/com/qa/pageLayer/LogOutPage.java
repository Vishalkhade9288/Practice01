package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class LogOutPage extends TestBase{

	public LogOutPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//li[@class='nav-item logout']")
	private WebElement log_out;
	
	public void clickOnLogOutButton()
	{
		log_out.click();
	}
}
