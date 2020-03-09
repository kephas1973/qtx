package hw03062020fri;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DropdownListPage extends SuperPageObject {

	public DropdownListPage(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
	}
	
	@FindBy(id="dropdown")
	WebElement dropdownList;
	
	public String GetSelectedDropdownlistItemText() {
		return getSelect(dropdownList).getFirstSelectedOption().getText();
	}

	public DropdownListPage navigate() {
		super.navigate("/dropdown");	
		
		return this;
	}

	public DropdownListPage SelectOption(String selection) {
		getSelect(dropdownList).selectByVisibleText(selection);
		
		return this;
	}
}
