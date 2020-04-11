package hwWeek4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class getValue extends PageObjectSuperClass {

	public getValue(WebDriver driverInstance) {
		super(driverInstance);
	}
	
	@FindBy(xpath="//*[@id=\"table1\"]/tbody/tr[3]/td[4]")
	private WebElement dollarAmount;

	public getValue goToPage() {
		navigate("/tables");
		return this;
	}

	public String getDollarAmount() {
		return dollarAmount.getText();
	}
	
}
