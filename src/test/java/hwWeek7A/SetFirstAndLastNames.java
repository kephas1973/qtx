package hwWeek7A;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SetFirstAndLastNames extends SuperPageObject {
	
	@FindBy(xpath="//*[@id=\"content\"]/div[2]/div/form/fieldset/div[8]/input")
	WebElement firstNameField;
	
	@FindBy(xpath="//*[@id=\"lastname\"]")
	WebElement lastNameField;
	
	String firstNameStr = new String("Robert");
	String lastNameStr = new String("Rose");

	public SetFirstAndLastNames(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
	}
	
	public SetFirstAndLastNames navigate() {
		super.navigate("");
		
		return this;
	}

	public SetFirstAndLastNames fillFirstName() {
		firstNameField.sendKeys(firstNameStr);
		return this;
	}

	public SetFirstAndLastNames fillLastName() {
		lastNameField.sendKeys(lastNameStr);
		return this;
	}

}
