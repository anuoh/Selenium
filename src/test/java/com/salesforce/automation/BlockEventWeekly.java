package com.salesforce.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BlockEventWeekly {

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
	WebElement home= driver.findElement(By.xpath("//a[text()='Home']"));
	home.click();
	WebElement date= driver.findElement(By.xpath("//a[text()='Sunday February 11, 2024']"));
	date.click();	
	WebElement timeLink= driver.findElement(By.xpath("//*[@id=\"p:f:j_id25:j_id61:28:j_id64\"]"));
	timeLink.click();
	}

}
