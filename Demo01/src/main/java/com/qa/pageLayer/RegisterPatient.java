package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.testBase.TestBase;

public class RegisterPatient extends TestBase{

	public RegisterPatient()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='givenName']")
	private WebElement first_name;
	
	public void enterFirstName(String FirstName)
	{
		first_name.sendKeys(FirstName);
	}
	
	@FindBy(xpath="//input[@name='middleName']")
	private WebElement middle_name;
	
	public void enterMiddleName(String MiddleName)
	{
		middle_name.sendKeys(MiddleName);
	}
	
	@FindBy(xpath="//input[@name='familyName']")
	private WebElement last_name;
	
	public void enterLastName(String LastName)
	{
		last_name.sendKeys(LastName);
	}

	@FindBy(xpath="//button[@id='next-button']")
	private WebElement next_button;
	
	public void clickOnNextButton()
	{
		next_button.click();
	}
	
	@FindBy(xpath="//select[@id='gender-field']")
	private WebElement gender_field_box;
	public void selectGender()
	{
		Select sel01 = new Select(gender_field_box);
		sel01.selectByIndex(0);
	}
	
	@FindBy(xpath="//input[@id='birthdateDay-field']")
	private WebElement birth_day;
	
	public void enterBirthDay(String Date)
	{
		birth_day.sendKeys(Date);
	}
	
	@FindBy(xpath="//select[@id='birthdateMonth-field']")
	private WebElement birth_month;
	
	public void enterBirthMonth()
	{
		Select sel = new Select(birth_month);
		sel.selectByIndex(3);
	}
	
	@FindBy(xpath="//input[@id='birthdateYear-field']")
	private WebElement birth_year;
	
	public void enterBirthYear(String Year)
	{
		birth_year.sendKeys(Year);
	}
	
	@FindBy(xpath="//input[@id='address1']")
	private WebElement address;
	
	public void enterAddress(String Address)
	{
		address.sendKeys(Address);
	}
	
	@FindBy(xpath="//input[@id='address2']")
	private WebElement address_2;
	
	public void enterAddress2(String Address2)
	{
		address_2.sendKeys(Address2);
	}
	
	@FindBy(xpath="//input[@id='cityVillage']")
	private WebElement city_village;
	
	public void enterCityVillage(String CityVillage)
	{
		city_village.sendKeys(CityVillage);
	}
	
	@FindBy(xpath="//input[@id='stateProvince']")
	private WebElement state;
	
	public void enterState(String State)
	{
		state.sendKeys(State);
	}
	
	@FindBy(xpath="//input[@id='country']")
	private WebElement country;
	
	public void enterCountry(String Country)
	{
		country.sendKeys(Country);
	}
	
	@FindBy(xpath="//input[@id='postalCode']")
	private WebElement postal_code;
	
	public void enterPostalCode(String PostalCode)
	{
		postal_code.sendKeys(PostalCode);
	}
	
	@FindBy(xpath="//input[@name='phoneNumber']")
	private WebElement patient_phone_number;
	
	public void enterPatientPhoneNumber(String PhoneNumber)
	{
		patient_phone_number.sendKeys(PhoneNumber);
	}
	
	@FindBy(xpath="//select[@id='relationship_type']")
	private WebElement reletionship_type;
	
	public void selectReletionshipType()
	{
		Select sel01 = new Select(reletionship_type);
		sel01.selectByIndex(3);
	}
	
	@FindBy(xpath="//body/div[@id='body-wrapper']/div[@id='content']/form[@id='registration']/section[@id='relationships-info']/div[1]/fieldset[1]/div[1]/div[1]/p[2]/input[1]")
	private WebElement person_name;
	
	public void enterRelativeName(String RelativeName)
	{
		person_name.sendKeys(RelativeName);
	}
	
	@FindBy(xpath="//input[@id='submit']")
	private WebElement confirm_button;
	
	public void clickOnConfirmButton()
	{
		confirm_button.click();
	}
}
