package com.Automation;
//import org.junit.gen5.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DisableButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
		
		WebDriver  driver= new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
boolean isDisable	=	driver.findElement(By.id("disabled-button")).isDisplayed();
//boolean isDisable	=	driver.findElement(By.id("disabled-button")).isEnabled();

if(isDisable) {
	System.out.println("Btn is disabled");}
else {
	System.out.println("Btn is not disabled");}

	}
//driver.navigate().back();
//driver.navigate().forward();
//driver.navigate().refresh();
	
}
