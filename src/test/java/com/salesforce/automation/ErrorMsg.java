package com.salesforce.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ErrorMsg extends BaseTest {

	public static void main(String[] args) {
		
WebDriverManager.chromedriver().setup();
		
		WebDriver  driver= new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("123");
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("22131");
		WebElement clk= driver.findElement(By.id("Login"));
		clk.click();
		String actual_error= driver.findElement(By.id("error")).getText();
		String expected_error = "Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
		Assert.assertEquals(actual_error, expected_error);

}
}