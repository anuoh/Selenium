package com.salesforce.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesforceLogin extends BaseTest{

	public static void main(String[] args)  {
		
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
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	WebElement menuButton= driver.findElement(By.xpath("//*[@id=\"userNav-menuItems\"]/a[5]"));
	menuButton.click();
	//Thread.sleep(5000);
	WebElement username1 = driver.findElement(By.id("username"));
	username1.sendKeys("anupam@techarch.com");
	WebElement remember = driver.findElement(By.xpath("//*[@id=\"login_form\"]/div[3]/label"));
	remember.click();
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		driver.close();
	}
	}
	
