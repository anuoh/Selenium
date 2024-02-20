package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver  driver;
	
	
public LoginPage(WebDriver  driver)	{
	this.driver= driver;
	PageFactory.initElements(driver, this);
}

@FindBy(id="username")
private WebElement emailAdd;

@FindBy(id="password")
private WebElement password;

@FindBy(id="Login")
private WebElement btn;


public void emaiAdd() {
	emailAdd.sendKeys("anupam@techarch.com");	
}

public void password() {
	password.sendKeys("Kaisha@09");
}
public void btn() {	
	btn.click();
}
}