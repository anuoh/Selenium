package com.salesforce.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddAccount extends BaseTest {

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
	WebElement nwBtn=driver.findElement(By.xpath("//*[@id=\"hotlist\"]/table/tbody/tr/td[2]/input"));
	nwBtn.click();
	WebElement accName=driver.findElement(By.id("acc2"));
	accName.sendKeys("aaaa");
	WebElement typeDropDown= driver.findElement(By.id("acc6"));
	Select se=new Select(typeDropDown);
	se.selectByVisibleText("Technology Partner");
	
	WebElement priorityDropDown= driver.findElement(By.id("00Nal000000KB4b"));
	Select sel=new Select(priorityDropDown);
	sel.selectByVisibleText("High");
	
	WebElement saveButton=driver.findElement(By.className("btn"));
	saveButton.click();
	}

}
