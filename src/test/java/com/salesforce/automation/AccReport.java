package com.salesforce.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AccReport {

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
	WebElement lastActivity=driver.findElement(By.xpath("//a[text()='Accounts with last activity > 30 days']"));
	lastActivity.click();
	WebElement save1=driver.findElement(By.id("ext-gen49"));
	save1.click();
	WebElement reportName=driver.findElement(By.id("saveReportDlg_reportNameField"));
	reportName.sendKeys("rep");
	WebElement reportUName=driver.findElement(By.id("saveReportDlg_DeveloperName"));
	reportUName.sendKeys("rep1");
	WebElement save2=driver.findElement(By.id("ext-gen281"));
	save2.click();
	}

}
