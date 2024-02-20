package com.salesforce.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateAccount {

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
	
	WebElement plus= driver.findElement(By.xpath("//*[@id=\"AllTab_Tab\"]/a/img"));
	plus.click();
	WebElement custTab= driver.findElement(By.xpath("//*[@id=\"bodyCell\"]/div[3]/div[1]/table/tbody/tr/td[2]/input"));
	custTab.click();
	WebElement acc= driver.findElement(By.xpath("//*[@id=\"duel_select_0\"]/option[1]"));
	acc.click();
	WebElement arrow= driver.findElement(By.xpath("//*[@id=\"duel_select_0_right\"]/img"));
	arrow.click();
	WebElement save= driver.findElement(By.xpath("//*[@id=\"bottomButtonRow\"]/input[1]"));
	save.click();
	driver.close();
	}

}
