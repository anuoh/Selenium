package com.salesforce.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Leads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
	WebElement leadsTab = driver.findElement(By.id("Lead_Tab"));
	leadsTab.click();
	WebElement dropDownElement = driver.findElement(By.id("fcf"));
	Select dropLeads = new Select(dropDownElement);
	dropLeads.selectByVisibleText("My Unread Leads");
	WebElement newBtn = driver.findElement(By.xpath("//*[@id=\"hotlist\"]/table/tbody/tr/td[2]/input"));
	newBtn.click();
	WebElement lName = driver.findElement(By.id("name_lastlea2"));
	lName.sendKeys("ABCD");
	WebElement cName = driver.findElement(By.id("lea3"));
	cName.sendKeys("ABCD");
	WebElement saveBtn= driver.findElement(By.className("btn"));
	saveBtn.click();
	driver.close();
	}

}
