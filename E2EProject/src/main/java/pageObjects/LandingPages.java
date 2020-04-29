package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LandingPages {
	
public WebDriver driver;

//@FindBy (css="a[href*='sign_in']")  
//WebElement signin;
By signin=By.xpath("//span[contains(text(),'Login')]");
By title = By.xpath("//h2[text()='Featured Courses']");
By NavBar = By.xpath("//nav[@class='navbar-collapse collapse']");

public LandingPages(WebDriver driver) {
	// TODO Auto-generated constructor stub
	this.driver=driver;
}

public  WebElement getlogin() {
	return driver.findElement(signin);
}
public  WebElement getVavigateBar() {
	return driver.findElement(NavBar);
}
public  WebElement getTitle() {
	return driver.findElement(title);
}
}
