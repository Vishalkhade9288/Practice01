package com.qa.testBase;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.qa.pageLayer.FindPatientRecordPage;
import com.qa.pageLayer.HomePage;
import com.qa.pageLayer.LogInPage;
import com.qa.pageLayer.LogOutPage;
import com.qa.pageLayer.RegisterPatient;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public static WebDriver driver;
	public LogInPage login;
	public LogOutPage logout;
	public HomePage home;
	public RegisterPatient reg;
	public FindPatientRecordPage find;
	
	@Parameters("browser")
	@BeforeMethod
	public void setUp(String br)
	{
		if(br.equalsIgnoreCase("chrome"))
		{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		}
		else if(br.equalsIgnoreCase("edge"))
		{
		WebDriverManager.edgedriver().setup();
		driver = new ChromeDriver();
		}
		else if(br.equalsIgnoreCase("firefox"))
		{
		WebDriverManager.firefoxdriver().setup();
		driver = new ChromeDriver();
		}
		else
		{
			System.out.println("please provide valid browser name");
		}
		
		driver.get("https://demo.openmrs.org/openmrs/login.htm");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		
		login = new LogInPage();
		logout = new LogOutPage();
		home = new HomePage();
		reg = new RegisterPatient();
		find = new FindPatientRecordPage();
	}
	
	@AfterMethod
	public void tearOut()
	{
		driver.quit();
	}
}
