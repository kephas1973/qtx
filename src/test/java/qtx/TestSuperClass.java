package qtx;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public abstract class TestSuperClass {

	protected WebDriver driver;

	/*	@BeforeTest
	public void beforeTest() {
		//driver = DriverManagerFactory.getManager(DriverTypes.CHROME).getDriver();
		driver = DriverManagerFactory.getManager(DriverTypes.FIREFOX).getDriver();
		driver.navigate().to(TheInternet_1.URL);
	}*/

	@Parameters("browser")
	@BeforeClass
	public void setup(@Optional("firefox") String browser) throws Exception {
		System.out.println("This is: " + browser.toUpperCase());
			if(browser.equalsIgnoreCase("firefox")) {
			driver = DriverManagerFactory.getManager(DriverTypes.FIREFOX).getDriver();
			driver.navigate().to(TheInternet_1.URL);
		}
				else if(browser.equalsIgnoreCase("chrome")) {
			driver = DriverManagerFactory.getManager(DriverTypes.CHROME).getDriver();
			driver.navigate().to(TheInternet_1.URL);
		}
					else if(browser.equalsIgnoreCase("edge")) {
			driver = DriverManagerFactory.getManager(DriverTypes.EDGE).getDriver();
			driver.navigate().to(TheInternet_1.URL);
		}
		else {
			//If no browser passed throw exception
			throw new Exception("Browser is not correct");
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
