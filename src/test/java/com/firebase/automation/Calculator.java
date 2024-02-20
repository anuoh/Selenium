package com.firebase.automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calculator {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://qa-tekarch.firebaseapp.com/");
		driver.manage().window().maximize();
		
		WebElement username= driver.findElement(By.id("email_field"));
		username.sendKeys("admin123@gmail.com");
	
		WebElement password=driver.findElement(By.id("password_field"));
		password.sendKeys("admin123");
	
		WebElement loginButton= driver.findElement(By.tagName("button"));
		loginButton.click();
		
		//WebElement calButton= driver.findElement(By.xpath("//a[contains(text()='Calculator')]"));
		WebElement calButton= driver.findElement(By.xpath("//*[@id=\"user_div\"]/div[1]/a[2]"));
		calButton.click();
		WebElement seven= driver.findElement(By.xpath("//input[@class='button digits' and @type='button' and @value='7']"));
		seven.click();
	WebElement plus= driver.findElement(By.xpath("//*[@id=\"container\"]/form/input[5]"));
		plus.click();
		WebElement two= driver.findElement(By.xpath("//*[@id=\"container\"]/form/input[11]"));
		two.click();
		WebElement equals= driver.findElement(By.xpath("//input[@class='button mathButtons' and @type='button' and @value='=']"));
		equals.click();
		WebElement answer= driver.findElement(By.xpath("//input[@id='display' and @type='text' and @name='display' and @readonly='']"));
		answer.click();
		
	}

}
