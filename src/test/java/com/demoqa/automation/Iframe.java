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

public class Iframe {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver  driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demoqa.com/nestedframes");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		System.out.println("frames=" + frames.size());
	
		
/*	WebElement frame	=(WebElement) driver.switchTo().frame("//iframe[@id='frame1']");
WebDriverWait wait = new WebDriverWait(driver, 10);		
wait.until(ExpectedConditions.visibilityOf(frame));
		//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='frame1']")));		
		System.out.println("This is PArent frame");
	*/
		
		//This element is inside 2 nested frames.
		
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@id='frame1']"));
		System.out.println("This is PArent frame"  +frame1);
		
		WebElement frame2 = driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
	
		System.out.println("This is Child frame"  +frame2);
		
		driver.switchTo().frame(frame1);
		
		driver.switchTo().frame(frame2);

	
		driver.quit();

	}

}
