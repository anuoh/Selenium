package com.salesforce.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BlockEvent {

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
	WebElement home= driver.findElement(By.xpath("//a[text()='Home']"));
	home.click();
	WebElement date= driver.findElement(By.xpath("//a[text()='Sunday February 11, 2024']"));
	date.click();

	WebElement timeLink= driver.findElement(By.xpath("//*[@id=\"p:f:j_id25:j_id61:28:j_id64\"]"));
	timeLink.click();			
	WebElement popUp= driver.findElement(By.xpath("//*[@id=\"ep\"]/div[2]/div[4]/table/tbody/tr[2]/td[2]/div/a/img"));
	popUp.click();			
WebElement other= driver.findElement(By.xpath("/html/body/div[2]/ul/li[5]/a/text()"));	other.click();			
				
	WebElement selectDate= driver.findElement(By.id("/html/body/div[2]/ul/li[5]/a/text()"));
	selectDate.click();
	WebElement save= driver.findElement(By.id("//*[@id=\"bottomButtonRow\"]/input[1]"));
	save.click();	
driver.close();
	}

}
