package com.salesforce.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Random {

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
		WebElement home= driver.findElement(By.xpath("//a[text()='Home']"));
		home.click();	
		WebElement abhar= driver.findElement(By.xpath("//a[text()='Anupam Bhard']"));
		abhar.click();		
	}

}
