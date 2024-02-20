package tests;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.ForgotPasswordPage;
import pages.LoginPage;

public class LoginTest {
	WebDriver  driver;
	


@BeforeTest
public void launchApp()	{
	driver= new ChromeDriver();	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
	driver.get("https://login.salesforce.com/");
	}

@Test
	public void salesforceLoginTest() {
LoginPage obj	= new LoginPage(driver);
		
obj.emaiAdd();
obj.password();
obj.btn();

}

@AfterTest
public void closeBrowser() {

driver.close();
}
	
}