package com.Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HideButton {

	public static void main(String[] args) {
		
WebDriverManager.chromedriver().setup();
		
		WebDriver  driver= new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();
		/*List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@id='bmwcheck'and @id='hondacheck'")) ;       
        
	       // driver.quit();
	for (WebElement chk:checkboxes) {
		String chkboxname=chk.getAttribute("id");
		if(chkboxname.equals("BMW")|| chkboxname.equals("Honda"))
		{
			chk.click();
	}*/

		WebElement hideButton = driver.findElement(By.id("hide-textbox"));
		hideButton.click();
		System.out.println(hideButton.isDisplayed());
		driver.quit();
}
}