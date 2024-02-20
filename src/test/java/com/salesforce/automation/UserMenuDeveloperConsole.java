package com.salesforce.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UserMenuDeveloperConsole {

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
	
	WebElement userMenu= driver.findElement(By.id("userNavLabel"));
	userMenu.click();		
	WebElement developerConsole= driver.findElement(By.xpath("//a[text()='Developer Console']"));
	developerConsole.click();			
	WebElement close= driver.findElement(By.id("closeBtn"));
	close.click();
	WebElement logout= driver.findElement(By.xpath("//a[text()='Logout']"));
	logout.click();		
	}

}
