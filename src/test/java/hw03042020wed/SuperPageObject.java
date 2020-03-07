package hw03042020wed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SuperPageObject {
	
	protected WebDriver driver;
	private String bassUrl;
	
	protected SuperPageObject(WebDriver driverInstance, String baseUrl) {
		
		driver = driverInstance;
		PageFactory.initElements(driver, this);
		
		bassUrl = baseUrl;
	}
	
	protected void Navigate(String url) {
		driver.get(bassUrl + url);
	}
	
}
