package com.datadriven.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DataDrivenTest {
	public void Loginform() {
	/* WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	driver.get("https://qa-tekarch.firebaseapp.com/");
	driver.manage().window().maximize();
	
	WebElement username= driver.findElement(By.id("email_field"));
	username.sendKeys("admin123@gmail.com");

	WebElement password=driver.findElement(By.id("password_field"));
	password.sendKeys("admin123");

	WebElement loginButton= driver.findElement(By.tagName("button"));
	loginButton.click();
	*/
	@DataProvider
}
}