package com.salesforce.automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateNewOpportunity {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
		
		WebDriver  driver= new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
	WebElement username = driver.findElement(By.id("username"));
	username.sendKeys("anupam@techarch.com");
	WebElement pass = driver.findElement(By.id("password"));
	pass.sendKeys("Kaisha@09"); 
	WebElement clk= driver.findElement(By.id("Login"));
	clk.click();		
WebElement oppBtn= driver.findElement(By.xpath("//a[text()='Opportunities']"));
	oppBtn.click();
	WebElement nwBtn= driver.findElement(By.xpath("//*[@id=\"hotlist\"]/table/tbody/tr/td[2]/input"));
	nwBtn.click();
	WebElement oName= driver.findElement(By.id("opp3"));
	oName.sendKeys("aa");
	WebElement aName= driver.findElement(By.id("opp4"));
	aName.sendKeys("bb");
	
	WebElement date= driver.findElement(By.id("opp9"));
	date.click();
	//WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
	//wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("datePickerCalendar")));
	WebElement dateDropDown= driver.findElement(By.id("calMonthPicker"));
	Select se=new Select(dateDropDown);
	se.selectByVisibleText("July");	

	
	WebElement yearDropDown= driver.findElement(By.id("calYearPicker"));
	Select sel2=new Select(yearDropDown);
	sel2.selectByVisibleText("2025");	
	
	WebElement dateSeventeen= driver.findElement(By.xpath("//*[@id=\"calRow3\"]/td[5]"));
	
	
	WebElement stageDropDown= driver.findElement(By.id("opp11"));
	Select sel=new Select(stageDropDown);
	sel.selectByVisibleText("Qualification");
	WebElement probability = driver.findElement(By.id("opp12"));
	probability.sendKeys("10"); 	
	WebElement leadSourceDropDown= driver.findElement(By.id("opp6"));
	Select sel1=new Select(leadSourceDropDown);
	sel1.selectByVisibleText("Web");
	WebElement pc = driver.findElement(By.id("opp17"));
	pc.sendKeys("cc"); 
	
	driver.quit();
	}

}
