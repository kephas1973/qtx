package hw03062020fri;

import org.openqa.selenium.WebDriver;

public class InputPage extends SuperPageObject {

	public InputPage(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
	}

	public Object navigate() {
		super.navigate("/inputs");	
		return this;
	}

	public Object setInputValue(int readNumber) {
		return this;
	}
	
	public int getInputValue() {
		return 1;
	}
}
