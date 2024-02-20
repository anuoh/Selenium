package com.salesforce.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MergeAccount {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver  driver= new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
	WebElement username = driver.findElement(By.id("username"));
	username.sendKeys("anupam@techarch.com");
	WebElement pass = driver.findElement(By.id("password"));
	pass.sendKeys("Kaisha@09"); 
	WebElement clk= driver.findElement(By.id("Login"));
	clk.click();
	
	WebElement accBtn=driver.findElement(By.xpath("//*[@id=\"Account_Tab\"]/a"));
	accBtn.click();
	WebElement mergeLink=driver.findElement(By.xpath("//a[text()='Merge Accounts']"));
	mergeLink.click();
	
	
	
	
	
	
	
	}

}
