package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.ErrorMsgPage;

public class ErrorMsgTest {
	WebDriver  driver;
	
public static void main(String[] args) {
		salesforceForgotTest();

	}
	public static void salesforceForgotTest() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver  driver= new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		ErrorMsgPage emo = new ErrorMsgPage(driver);
		emo.user();
		emo.password();
		emo.btn();
		
	String actual_error= driver.findElement(By.id("error")).getText();
		String expected_error = "Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
		Assert.assertEquals(actual_error, expected_error);		
		
	}}
