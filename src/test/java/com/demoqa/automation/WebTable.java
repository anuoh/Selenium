package com.demoqa.automation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver  driver= new ChromeDriver();
		driver.get("https://demoqa.com/webtables ");
		driver.manage().window().maximize();
			
	//	1.Select table:
	List<WebElement> tableSel=driver.findElements(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]"));

	
	//2.To get no.of rows:
	List<WebElement> allR=driver.findElements(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]/div[1]/div[2]/div[2]"));
	
	System.out.println(allR.size());
	//3.Iterate rows,get text and print it		
			
			for(WebElement ee:allR) {
				String value=ee.getText();
				System.out.println(value);
			}
			WebDriverWait wait = new WebDriverWait(driver,30);
			WebElement del= driver.findElement(By.xpath("//*[@id=\"google_esf\"]"));
			del.click();
			

	
}
}