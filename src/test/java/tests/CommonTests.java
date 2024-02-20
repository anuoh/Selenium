package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class CommonTests {
	WebDriver  driver;
@BeforeTest
public void launchApp()	{
	driver= new ChromeDriver();	
	driver.manage().window().maximize();
	driver.get("https://login.salesforce.com/");
	}

}
