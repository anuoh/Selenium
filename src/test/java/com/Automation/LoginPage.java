package com.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {
	public static void main(String[] args) throws InterruptedException {
	
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
WebElement remember = driver.findElement(By.id("rememberUn"));
remember.click();

WebElement userMenu= driver.findElement(By.id("userNavLabel"));
userMenu.click();
Thread.sleep(5000);
 //Actions action = new Actions(driver);
	//action.moveToElement(userMenu).build().perform();
	
WebElement menuButton= driver.findElement(By.xpath("//*[@id=\"userNav-menuItems\"]/a[5]"));
menuButton.click();
//Thread.sleep(5000);


Thread.sleep(5000);
	driver.close();
}
}