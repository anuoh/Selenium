package com.Automation;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTest2 {
	public static void main(String[] args) {
	
WebDriverManager.chromedriver().setup();
		
		WebDriver  driver= new ChromeDriver();
		driver.get( "https://www.selenium.dev/");
		
		WebElement download = driver.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[2]/a/span"));
		download.click();
		String expectedTitle= "Downloads | Selenium" ;
		String actualTitle= driver.getTitle();
		System.out.println(expectedTitle);
		System.out.println(actualTitle);
		
		if(actualTitle.equals(expectedTitle)){
		System.out.println("Test CAse Passed");
		}
		else {
		System.out.println("Test Case Failed");
		}
		
		driver.quit();

	}}

