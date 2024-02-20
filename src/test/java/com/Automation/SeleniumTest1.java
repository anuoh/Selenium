package com.Automation;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class SeleniumTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
		
		WebDriver  driver= new ChromeDriver();
		driver.get("https://google.com/");
		driver.manage().window().maximize();
		
		WebElement about = driver.findElement(By.xpath("//a[@class='MV3Tnb']"));
		about.click();
		String expectedTitle= "Google - About Google, Our Culture & Company News" ;
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

	}
}