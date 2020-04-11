package hwWeek7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RequestStatusCode extends PageObjectSuperClass {

	public RequestStatusCode(WebDriver driverInstance) {
		super(driverInstance);
	}

	public RequestStatusCode goToPage() {
		navigate("/status_codes");
		return this;
	}

	@FindBy(xpath="/html/body/div[2]/div/div/ul/li[1]/a") // full xpath
	WebElement statusCode200;
	@FindBy(xpath="/html/body/div[2]/div/div/ul/li[2]/a") // full xpath
	WebElement statusCode301;
	@FindBy(xpath="/html/body/div[2]/div/div/ul/li[3]/a") // full xpath
	WebElement statusCode404;
	@FindBy(xpath="/html/body/div[2]/div/div/ul/li[4]/a") // full xpath
	WebElement statusCode500;
	
	public RequestStatusCode click200() {
		statusCode200.click();
		return this;
	}

	public String getUrl() {
		String url = driver.getCurrentUrl();
		System.out.println("url = " + url);
		String expStatusCode = url.substring(47);
		
		return expStatusCode;
	}

	public RequestStatusCode click301() {
		statusCode301.click();
		return this;
	}

	public RequestStatusCode click404() {
		statusCode404.click();
		return this;
	}

	public RequestStatusCode click500() {
		statusCode500.click();
		return this;
	}

	

}
