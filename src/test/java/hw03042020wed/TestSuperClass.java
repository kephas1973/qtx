package hw03042020wed;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import qtx.DriverManagerFactory;

public abstract class TestSuperClass {
	
	protected WebDriver driver;
	
	//String url = "http://the-internet.herokuapp.com/login";
	protected static String baseUrl;
	
	@BeforeTest
	public void beforeTest() {
		//driver = DriverManagerFactory.getManager(DriverType.CHROME).getDriver();

		// PAGE FACTORY ...
		
		baseUrl = new String("http://the-internet.herokuapp.com");
	}
	
	@AfterTest
	public void afterTest() {
		//driver.quit();
	}

}
