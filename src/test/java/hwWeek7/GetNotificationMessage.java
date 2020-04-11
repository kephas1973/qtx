package hwWeek7;

import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GetNotificationMessage extends PageObjectSuperClass {
	
	@FindBy(xpath="//*[@id=\"content\"]/div/p/a")
	WebElement clickHere;
	
	//@FindBy(xpath="/html/body/div[1]/div/div")
	//WebElement notificationText;

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
		WebElement notificationText = driver.findElement(By.xpath("/html/body/div[1]/div/div"));
		
		return notificationText.getText();
	}

}
