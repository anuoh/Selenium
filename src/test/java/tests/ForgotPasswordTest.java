package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.ForgotPasswordPage;

public class ForgotPasswordTest {
	WebDriver  driver;
	
	public static void main(String[] args) {
		SalesforceForgotPasswordTest();

	}
	
	public static void SalesforceForgotPasswordTest() {
		WebDriverManager.chromedriver().setup();
		WebDriver  driver= new ChromeDriver();
		
		ForgotPasswordPage fpo = new ForgotPasswordPage(driver);		
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		fpo.user();
		fpo.link();
		fpo.continueBtn();
		driver.close();
}
}