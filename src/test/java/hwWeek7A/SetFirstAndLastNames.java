package hwWeek7A;
//
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SetFirstAndLastNames extends PageObjectSuperClass {
	
	@FindBy(name="firstname")
	WebElement firstNameField;
	
	@FindBy(id="lastname")
	WebElement lastNameField;
	
	public SetFirstAndLastNames(WebDriver driverInstance) {
		super(driverInstance);
	}

	public SetFirstAndLastNames fillFirstName(String firstNameStr) {
		firstNameField.sendKeys(firstNameStr);
		return this;
	}

	public SetFirstAndLastNames fillLastName(String lastNameStr) {
		lastNameField.sendKeys(lastNameStr);
		return this;
	}

	public SetFirstAndLastNames goToPage() {
		navigate("automation-practice-form/");
		return this;
	}

	public String getUrl() {
		return driver.getCurrentUrl();
	}

}
