package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPasswordPage {
	 WebDriver  driver;
	
	
	public ForgotPasswordPage(WebDriver  driver)	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="forgot_password_link")
	private WebElement link;

	@FindBy(id="un")
	private WebElement user;

	@FindBy(id="continue")
	private WebElement continueBtn;	
	
	
	public void link() {
link.click();
	}
	public void user() {
		user.sendKeys("anupam@techarch.com");
	}
		public void continueBtn() {
			continueBtn.click();
}}