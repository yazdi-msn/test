package Academy.E2EProject;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPages;
import pageObjects.LoginPage;
import resources.base;

public class validateTitle extends base {
	@BeforeTest
	public void initializeDriver() throws IOException {
		driver=initilizeDriver();
		driver.get(prop.getProperty("url"));
	}

	@Test
	public void basePageNavigation() throws IOException {
		
		LandingPages l=new LandingPages(driver);
		//compare the text from browser to expected text
		Assert.assertEquals(l.getTitle().getText(), "FEATURED COURSES");
		
	}
	@AfterTest
	public void teardown() {
		driver.close();
		driver=null;
	}

}
