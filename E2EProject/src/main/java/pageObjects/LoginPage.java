package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public WebDriver driver;
	By email=By.id("user_email");
	By passwordBy=By.id("user_password");
	By login=By.cssSelector("input.btn.btn-primary.btn-md.login-button");
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement getEmail() {
		return driver.findElement(email);
	}
	public WebElement getPassword () {
		return driver.findElement(passwordBy);
	}
	public WebElement clickLogin() {
		return driver.findElement(login);
	}

}
