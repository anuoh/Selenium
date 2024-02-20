package com.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumTest3 {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
				
				WebDriver  driver= new ChromeDriver();
				driver.get( "https://www.selenium.dev/");
				String text = driver.findElement(By.xpath("//h1[@class='d-1 fw-bold']")).getText();
	//text.getText();
			
				System.out.println(text);
				driver.quit();
}
}