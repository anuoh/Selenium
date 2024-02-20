package com.salesforce.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TabCustomization {

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
		
		WebElement allTabs= driver.findElement(By.xpath("//*[@id=\"AllTab_Tab\"]/a/img"));
		allTabs.click();
		WebElement customizeTabs= driver.findElement(By.xpath("//*[@id=\"bodyCell\"]/div[3]/div[1]/table/tbody/tr/td[2]/input"));
		customizeTabs.click();	
		WebElement assets= driver.findElement(By.xpath("//*[@id=\"duel_select_0\"]/option[5]"));
		assets.click();		
		WebElement remove= driver.findElement(By.xpath("//*[@id=\"duel_select_0_left\"]/img"));
		remove.click();
		WebElement save= driver.findElement(By.xpath("//*[@id=\"bottomButtonRow\"]/input[1]"));
		save.click();
		WebElement userMenu= driver.findElement(By.id("userNavLabel"));
		userMenu.click();
		WebElement logout= driver.findElement(By.id("//a[text()='Logout']"));
		logout.click();
				
		
	}

}
