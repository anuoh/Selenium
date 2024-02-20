package com.firebase.automation;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://qa-tekarch.firebaseapp.com/");
		Thread.sleep(5000);
		
/*		WebElement username= driver.findElement(By.id("email_field"));
		username.sendKeys("admin123@gmail.com");
	
		WebElement password=driver.findElement(By.id("password_field"));
		password.sendKeys("admin123");
	
		WebElement loginButton= driver.findElement(By.tagName("button"));
		loginButton.click();
*/
		//Convert web driver object to TakeScreenshot
		TakesScreenshot scrShot =(TakesScreenshot)driver;
		
		//Call getScreenshotAs method to create image file
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		
		//Move image file to new destination
		File DestFile=new File(System.getProperty("user.dir")+"/reports/screenshots/failure.png");
		
		//Copy file at destination
		FileUtils.copyFile(SrcFile, DestFile);
		System.out.println("completed");	
	}

}
