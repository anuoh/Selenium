package com.salesforce.automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class validateDropdownOptionsOpp extends BaseTest{

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
	WebElement oppTab = driver.findElement(By.xpath("//*[@id=\"Opportunity_Tab\"]/a"));
	oppTab.click();
	
	String expectedOptions [] = {"All Opportunities", "Closing Next Month", "Closing This Month", "My Opportunities","New Last Week" ,"New This Week","Opportunity Pipeline", "Private","Recently Viewed Opportunities","Won"};	
	
	WebElement dropDownEle = driver.findElement(By.id("fcf"));
	
	
	Select sel = new Select( dropDownEle);
	List<WebElement> options=sel.getOptions();
	

	for(int i=0;i<options.size();i++) {
		
		Assert.assertEquals(options.get(i).getText(), expectedOptions[i]);
System.out.println(options.get(i).getText()+ "->"+expectedOptions[i])	;	
	}
WebElement newBtn1 = driver.findElement(By.xpath("//*[@id=\"hotlist\"]/table/tbody/tr/td[2]/input"));
newBtn1.click();
	driver.close();
}

	}

