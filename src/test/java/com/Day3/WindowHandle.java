package com.Day3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandle {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver  driver= new ChromeDriver();
		driver.get("");
		driver.manage().window().maximize();
		//*[@id="1694196290716_waf"]/div[1]/article/div[2]/div/pbc-button/a
	}

}
