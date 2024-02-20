package com.Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtonSelected {

	public static void main(String[] args) {
		//WebElement driver;
		WebDriverManager.chromedriver().setup();
		
		WebDriver  driver= new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		WebElement radioButton = driver.findElement(By.id("hondaradio"));
		if (radioButton.isSelected()) {
			 System.out.println("Field is selected");}
			 else {
				 System.out.println("Field is not Selected");
			 }
	
 
}
}
	
