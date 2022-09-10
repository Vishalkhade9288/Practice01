package com.qa.testLayer;

import org.testng.annotations.Test;
import com.qa.testBase.TestBase;

public class RegisterAPatient extends TestBase{

	@Test
	public void registerAPatient() throws InterruptedException
	{
		login.enterUsername("Admin");
		login.enterPassword("Admin123");
		login.selectLocationForTheSession();
		login.clickOnLogInButton();
			Thread.sleep(3000);
		home.clickOnRegisterAPatient();
			Thread.sleep(3000);
		reg.enterFirstName("Vishal");
		reg.enterMiddleName("Bandu");
		reg.enterLastName("Khade");
		reg.clickOnNextButton();
			Thread.sleep(3000);
		reg.selectGender();
		reg.clickOnNextButton();
			Thread.sleep(3000);
		reg.enterBirthDay("13");
		reg.enterBirthMonth();
		reg.enterBirthYear("1995");
		reg.clickOnNextButton();
			Thread.sleep(3000);
		reg.enterAddress("Mendholi");
		reg.enterAddress2("Near Shirpur");
		reg.enterCityVillage("Wani");
		reg.enterState("Maharashtra");
		reg.enterCountry("India");
		reg.enterPostalCode("445304");
		reg.clickOnNextButton();
			Thread.sleep(3000);
		reg.enterPatientPhoneNumber("9545171623");
		reg.clickOnNextButton();
			Thread.sleep(3000);
		reg.selectReletionshipType();
		reg.enterRelativeName("Vikas");
		reg.clickOnNextButton();
			Thread.sleep(3000);
		reg.clickOnConfirmButton();
		
		System.out.println("Test Case 03 - Register A Patient is PASS");
		

	}
}
