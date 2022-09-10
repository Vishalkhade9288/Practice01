package com.qa.pageLayer;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class FindPatientRecordPage extends TestBase{

	public FindPatientRecordPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='patient-search']")
	private WebElement search_by_id;
	
	public void searchById(String PatientId)
	{
		search_by_id.sendKeys(PatientId+Keys.ENTER);
	}
	
	@FindBy(xpath="//tbody/tr[1]/td[1]")
	private WebElement select_patient_id;
	
	public void clickOnPatientId()
	{
		select_patient_id.click();
	}
	
	
}
