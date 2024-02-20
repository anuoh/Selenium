package com.salesforce.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UserMenuDropDown {

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
	
	WebElement UserMenu= driver.findElement(By.id("userNavLabel"));
	UserMenu.click();
	WebElement myProfile= driver.findElement(By.xpath("//a[text()='My Profile']"));
	myProfile.click();
	WebElement pencilBtn= driver.findElement(By.xpath("//*[@id=\"chatterTab\"]/div[2]/div[2]/div[1]/h3/div/div/a/img"));
	pencilBtn.click();
	WebElement about= driver.findElement(By.xpath("//*[@id=\"aboutTab\"]/a"));
	about.click();
	
//	WebElement lName = driver.findElement(By.id("lastName"));
//	lName.sendKeys("bha"); 
	//*[@id="sortDisplay"]
	WebElement saveAll= driver.findElement(By.xpath("//*[@id=\"TabPanel\"]/div/div[2]/form/div/input[1]"));
	saveAll.click();	
	}

}
