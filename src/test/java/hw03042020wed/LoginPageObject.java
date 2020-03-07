package hw03042020wed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObject extends SuperPageObject {
	
	protected static String urlLoginAppended;
	
	public LoginPageObject(WebDriver driverInstance, String url) {
		super(driverInstance, url);
	}
	
	public LoginPageObject OpenLoginPage() {
		
		urlLoginAppended = new String("/login");
		
		Navigate(baseUrl + urlLoginAppended);
		return this;
	}
	
	public SecurePageObject login(String userName, String password) {
		
		WebElement userNameTextBox = driver.findElement(By.id("username"));
		WebElement passwordTextBox = driver.findElement(By.id("password"));
		WebElement submitBox = driver.findElement(By.tagName("button"));
		userNameTextBox.sendKeys(userName);
		passwordTextBox.sendKeys(password);
		submitBox.click();
		return new SecurePageObject(driver, );
	}

}
