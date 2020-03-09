package hw03062020fri;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends SuperPageObject{

	public HomePage(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
	}

	public HomePage navigate() {
		super.navigate("");
		
		//return null;
		return this;
	}

	public String GetTitle() {
		return driver.getTitle();
		
		//return null;
	}
}
