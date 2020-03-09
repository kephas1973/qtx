package hw03062020fri;

//import java.util.HashMap;
//import java.util.Map;
//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeDriverManager extends DriverManager {

	@Override
	protected void createDriver() {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\dtaylor\\eclipse-workspace\\qtx\\src\\framework\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "c:\\\\chromedriver.exe");
		
/*		ChromeOptions options = new ChromeOptions();
		
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("credentials_enable_service", false);
		prefs.put("profile.password_manager_enabled", false);

		options.setExperimentalOption("prefs", prefs);

		driver = new ChromeDriver(options);
*/
		driver = new ChromeDriver();
	}
}
