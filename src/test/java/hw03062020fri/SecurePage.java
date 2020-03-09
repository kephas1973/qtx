package hw03062020fri;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SecurePage extends SuperPageObject {
	public SecurePage(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
	}

	public String GetMessageText() {
		WebElement flashMessage = driver.findElement(By.id("flash"));
		return flashMessage.getText();
	}
}
