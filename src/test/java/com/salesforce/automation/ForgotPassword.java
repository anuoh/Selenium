package com.salesforce.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ForgotPassword extends BaseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
		
		WebDriver  driver= new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		WebElement forgotBtn = driver.findElement(By.id("forgot_password_link"));
		forgotBtn.click();
		WebElement user = driver.findElement(By.id("un"));
		user.sendKeys("anupam@techarch.com");
		WebElement continueBtn = driver.findElement(By.id("continue"));
		continueBtn.click();
	}

}
