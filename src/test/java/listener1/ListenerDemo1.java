package listener1;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class ListenerDemo1 {
	WebDriver driver;
	@Test
	public void test1() {
		System.out.println("I am Inside test1");
	}
		
	
	@Test
	public void test2() {
		System.out.println("I am Inside test2");
WebDriverManager.chromedriver().setup();
ChromeDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
	driver.findElement(By.id("username")).sendKeys("anupam@techarch.com");
 driver.findElement(By.id("password")).sendKeys("Kaisha@09") ;
driver.findElement(By.id("Login")).click();
	driver.close();
	}	
	
	@Test
	public void test3() {
		System.out.println("I am Inside test3");
	}	

}
