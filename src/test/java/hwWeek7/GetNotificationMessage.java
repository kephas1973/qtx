package hwWeek7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GetNotificationMessage extends PageObjectSuperClass {
	
	@FindBy(how=How.LINK_TEXT, using="Click here")
	WebElement clickHere;
	
	public GetNotificationMessage(WebDriver driverInstance) {
		super(driverInstance);
	}

	public GetNotificationMessage goToPage() {
		navigate("/notification_message_rendered");
		return this;
	}

	public GetNotificationMessage clickHere() {
		clickHere.click();
		return this;
	}

	public String getMessageText() {
		WebElement notificationText = driver.findElement(By.id("flash"));
		
		return notificationText.getText();
	}
}
