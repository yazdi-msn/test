package Academy.E2EProject;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPages;
import pageObjects.LoginPage;
import resources.base;

public class HomePage extends base {
	/*@BeforeTest
	public void initializeDriver() throws IOException {
		//driver=initilizeDriver();
		//driver.get(prop.getProperty("url"));
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}*/

	@Test(dataProvider="getData")
	public void basePageNavigation(String Username,String Password,String text) throws IOException {
		driver=initilizeDriver();
		driver.get(prop.getProperty("url"));
		//String text =null;
		LandingPages l=new LandingPages(driver);
		l.getlogin().click();
		LoginPage lp = new LoginPage(driver);
		lp.getEmail().sendKeys(Username);
		lp.getPassword().sendKeys(Password);
		lp.clickLogin().click();
		System.out.println(text);
		
	}
	
	@DataProvider
	public Object[][] getData() {
		Object[][] data=new Object[2][3];
		data[0][0]="RestrictedUser@yahoo.com";
	    data[0][1]="12345";
	    data[0][2]="Restricted User";
	    
	    data[1][0]="nonrestricted@yahoo.com";
	    data[1][1]="5678";
	    data[1][2]="Non_Restricted";
	    
	    return data;
	    		
	}
	@AfterTest
	public void teardown() {
		driver.close();
		driver=null;
	}
}
