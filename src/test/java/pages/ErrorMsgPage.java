package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ErrorMsgPage {
	WebDriver  driver;
	
	
	
	public ErrorMsgPage(WebDriver  driver)	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	
}
	@FindBy(id="username")
	private WebElement user;

	@FindBy(id="password")
	private WebElement password;

	@FindBy(id="Login")
	private WebElement btn;

	
	public void user() {
		user.sendKeys("123");
	}

	public void password() {
		password.sendKeys("22131");
		}
	public void btn() {	
		btn.click();
	}}

