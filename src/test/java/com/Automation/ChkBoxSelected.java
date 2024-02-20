package com.Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChkBoxSelected {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver  driver= new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
	WebElement chkbox=driver.findElement(By.id("bmwcheck"));
    chkbox.click();
	 System.out.println(chkbox.isSelected());
    WebElement chkbox1=driver.findElement(By.id("hondacheck"));
      chkbox1.click();
      System.out.println(chkbox1.isSelected());
      driver.close();
}
}