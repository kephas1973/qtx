package qtx;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public abstract class TestSuperClass {

	protected WebDriver driver;

	@BeforeTest
	public void beforeTest() {
		driver = DriverManagerFactory.getManager(DriverType.CHROME).getDriver();
		driver.navigate().to(TheInternet_1.URL);
	}

	@AfterTest
	public void afterTest() {
		//driver.quit();
	}

}
