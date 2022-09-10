package com.qa.testLayer;

import org.testng.annotations.Test;

import com.qa.testBase.TestBase;

public class LogOutTest extends TestBase {

	@Test
	public void logOut()
	{
		login.enterUsername("Admin");
		login.enterPassword("Admin123");
		login.selectLocationForTheSession();
		login.clickOnLogInButton();
		
		logout.clickOnLogOutButton();
		System.out.println("Test Case 02 - Log Out Test is PASS");

	}
}
