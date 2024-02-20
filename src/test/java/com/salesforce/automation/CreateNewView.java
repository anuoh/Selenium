package com.salesforce.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateNewView extends BaseTest {

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
	WebElement newViewBtn=driver.findElement(By.xpath("//a[text()='Create New View']"));
	newViewBtn.click();	
	WebElement viewName=driver.findElement(By.id("fname"));
	viewName.sendKeys("aaaa");	
	WebElement viewUniqueName=driver.findElement(By.id("devname"));
	viewUniqueName.sendKeys("bbbb");	
	WebElement saveViewBtn=driver.findElement(By.xpath("//*[@id=\"editPage\"]/div[1]/table/tbody/tr/td[2]/input[1]"));
	saveViewBtn.click();
	
driver.quit();
	}

}
