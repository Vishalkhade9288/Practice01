package com.qa.testLayer;

import org.testng.annotations.Test;

import com.qa.testBase.TestBase;

public class FindPatientRecordTest extends TestBase{

	@Test
	public void findPatientRecord() throws InterruptedException
	{
		login.enterUsername("Admin");
		login.enterPassword("Admin123");
		login.selectLocationForTheSession();
		login.clickOnLogInButton();
		Thread.sleep(3000);
		home.clickOnFindPatientRecord();
		Thread.sleep(3000);
		find.searchById("100NNT");
		System.out.println("Test Case 04 - Find Patient Record Test is PASS");
		
	}
}
