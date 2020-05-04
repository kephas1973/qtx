package qtx;

import org.openqa.selenium.edge.EdgeDriver;

public class EdgeDriverManager extends DriverManager {

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
		System.setProperty("webdriver.edge.driver", "c:\\\\msedgedriver.exe");
		driver = new EdgeDriver();

		//long time = 10000;
		//TimeUnit unit = TimeUnit.MILLISECONDS;
		//driver.manage().timeouts().implicitlyWait(time, unit);
		//driver.manage().timeouts().pageLoadTimeout(time, unit);
	}

}
