package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.core.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class base {

	public static WebDriver driver;
	public Properties prop;
	public WebDriver initilizeDriver() throws IOException {
	prop = new Properties();
		FileInputStream fls = new FileInputStream("C:\\Users\\ahmadian.msn\\eclipse-workspace\\E2EProject\\src\\main\\java\\resources\\data.properties");
		prop.load(fls);
		String browserName=prop.getProperty("browser");
		
		if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
			driver =new ChromeDriver();
		}
		else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\work\\geckodriver.exe");
		    driver = new FirefoxDriver();
		}
		else if (browserName.equalsIgnoreCase("IE")){
			System.setProperty("webdriver.ie.driver", "C:\\work\\MicrosoftWebDriver.exe");
			driver = new InternetExplorerDriver();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	public void getScreenshot() throws IOException{
	
				TakesScreenshot scrShot = ((TakesScreenshot)driver);
				
				//Call getScreenshotAs method to create image file
				File scrFile = scrShot.getScreenshotAs(OutputType.FILE);
				
				//Move image file to new destination
				File DestFile=new File("C:\\Users\\ahmadian.msn\\Documents\\screenshot.png");
				
				//Copy file at destination
				//FileUtils.copyFile(scrFile, DestFile);
				
	}
}
