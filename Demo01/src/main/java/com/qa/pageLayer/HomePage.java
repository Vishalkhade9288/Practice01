package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class HomePage extends TestBase{

	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//a[@class='btn btn-default btn-lg button app big align-self-center'])[3]")
	private WebElement register_a_patient;
	
	public void clickOnRegisterAPatient()
	{
		register_a_patient.click();
	}
	
	@FindBy(xpath="(//a[@class='btn btn-default btn-lg button app big align-self-center'])[1]")
	private WebElement find_patient_record;
	
	public void clickOnFindPatientRecord()
	{
		find_patient_record.click();
	}
	
	
}
