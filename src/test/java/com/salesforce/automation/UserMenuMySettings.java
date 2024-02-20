package com.salesforce.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UserMenuMySettings {

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
	WebElement mySettings= driver.findElement(By.xpath("//a[text()='My Settings']"));
	mySettings.click();	
	
	WebElement personal = driver.findElement(By.id("PersonalInfo_font"));
	personal.click(); 
	WebElement loginHistory = driver.findElement(By.id("LoginHistory_font"));
	loginHistory.click(); 
	WebElement displayAndLayout = driver.findElement(By.id("DisplayAndLayout_font"));
	displayAndLayout.click();
	WebElement customizeMyTab = driver.findElement(By.id("CustomizeTabs_font"));
	customizeMyTab.click();
	WebElement reportDropDown= driver.findElement(By.id("duel_select_0"));
	Select se=new Select(reportDropDown);
	se.selectByValue("report");
	WebElement save = driver.findElement(By.xpath("//*[@id=\"bottomButtonRow\"]/input[1]"));
	save.click();	
	}

}
