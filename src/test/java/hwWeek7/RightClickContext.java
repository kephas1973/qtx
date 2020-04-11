package hwWeek7;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class RightClickContext extends PageObjectSuperClass {
	
	@FindBy(id="hot-spot")
	WebElement contextMenu;
	
	public RightClickContext(WebDriver driverInstance) {
		super(driverInstance);
	}

	public RightClickContext goToPage() {
		navigate("/context_menu");
		return this;
	}

	public RightClickContext rightClick() {
		Actions actions = new Actions(driver);
		actions.contextClick(contextMenu).perform();
		return this;
	}

	public String handleJSAlert() {
		Alert alert = driver.switchTo().alert();
		String alertResponse = alert.getText();
		alert.accept();
		driver.switchTo().defaultContent();
		//contextMenu.click();
		
		return alertResponse;
	}
}
