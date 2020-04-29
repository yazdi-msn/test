package Academy.E2EProject;

import static org.testng.Assert.assertTrue;

import java.io.FileInputStream;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPages;
import pageObjects.LoginPage;
import resources.base;

public class validateNavigationBar extends base {
	@BeforeTest
	public void initializeDriver() throws IOException {
		driver=initilizeDriver();
		driver.get(prop.getProperty("url"));
	}

	@Test
	public void basePageNavigation() throws IOException {
	
		LandingPages l=new LandingPages(driver);
		//compare the text from browser to expected text
		Assert.assertTrue(l.getVavigateBar().isDisplayed());	
		
	}
	@AfterTest
	public void teardown() {
		driver.close();
		driver=null;
	}

}
