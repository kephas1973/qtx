package hwWeek7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RequestStatusCode extends PageObjectSuperClass {

	public RequestStatusCode(WebDriver driverInstance) {
		super(driverInstance);
	}

	public RequestStatusCode goToPage() {
		navigate("/status_codes");
		return this;
	}

	// clicking the link actually returns a new page (ex: http://the-internet.herokuapp.com/status_codes/200)
	// you should create a new page object for each page then return that page.
	//getUrl() should be moved to the new page.
	public RequestStatusCode clickStatusCodeLink(String statusCode) {
		getStatusCodeElement(statusCode).click();
		return this;
	}
	
	public String getUrl() {
		String url = driver.getCurrentUrl();
		System.out.println("url = " + url);
		String expStatusCode = url.substring(47);
		
		return expStatusCode;
	}
	
	private WebElement getStatusCodeElement(String statusCode) {
		String xpathExpression = "//div[@id='content']//ul/li/a[text()='" + statusCode + "']";
		return driver.findElement(By.xpath(xpathExpression));
	}
}
