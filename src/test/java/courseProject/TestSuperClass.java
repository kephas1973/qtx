package courseProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestSuperClass {
	protected WebDriver driver;
	protected String baseUrl;
	protected DriverManager driverManager;
	
	@BeforeTest
	public void beforeTest() throws Exception {
		driverManager = DriverManagerFactory.getManager(DriverTypes.CHROME);	
		driver = driverManager.getDriver();
		
		long time = 20;
		TimeUnit unit = TimeUnit.SECONDS;
		driver.manage().timeouts().implicitlyWait(time, unit);
		driver.manage().timeouts().pageLoadTimeout(time, unit);

	}

	@AfterTest
	public void afterTest() {
		//driverManager.quitDriver();
	}
}
