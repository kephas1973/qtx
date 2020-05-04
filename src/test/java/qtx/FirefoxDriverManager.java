package qtx;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverManager extends DriverManager {

	@Override
	protected void startService() {
		// TODO Auto-generated method stub

	}

	@Override
	protected void stopService() {
		// TODO Auto-generated method stub

	}

	@Override
	protected void createDriver() {
		System.setProperty("webdriver.gecko.driver", "c:\\\\geckodriver.exe");
		driver = new FirefoxDriver();
	}

}
