package com.salesforce.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditView extends BaseTest {

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
	WebElement edit= driver.findElement(By.xpath("//a[text()='Edit']"));
	edit.click();
	WebElement viewName=driver.findElement(By.id("fname"));
	viewName.sendKeys("sil");	
	
	WebElement filterDropDown= driver.findElement(By.id("fcol1"));
	Select se=new Select(filterDropDown);
	se.selectByVisibleText("Account Name");
	
	WebElement operatorDropDown= driver.findElement(By.id("fop1"));
	Select se1=new Select(operatorDropDown);
	se1.selectByVisibleText("contains");
	
	WebElement value=driver.findElement(By.id("fval1"));
	value.sendKeys("a");
	WebElement saveBtn=driver.findElement(By.xpath("//*[@id=\"editPage\"]/div[3]/table/tbody/tr/td[2]/input[1]"));
	saveBtn.click();
	
	}

}
