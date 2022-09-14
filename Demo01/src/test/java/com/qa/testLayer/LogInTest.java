package com.qa.testLayer;

import org.testng.annotations.Test;

import com.qa.testBase.TestBase;

public class LogInTest extends TestBase {

	@Test
	public void logIn()
	{
		login.enterUsername("Admin");
		login.enterPassword("Admin123");
		login.selectLocationForTheSession();
		login.clickOnLogInButton();
		logger.info("Test Case 01 - Log In Test is PASS");
	}
}
