package hwWeek7A;
//
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import hwWeek7A.DropDownPageObject;

public class SetFormValues extends PageObjectSuperClass {

	@FindBy(name="firstname")
	WebElement firstNameField;

	@FindBy(id="lastname")
	WebElement lastNameField;

	@FindBy(id="sex-0")
	WebElement maleRadioButton;

	@FindBy(id="sex-1")
	WebElement femaleRadioButton;

	@FindBy(id="exp-0")
	WebElement exp1;

	@FindBy(id="exp-1")
	WebElement exp2;

	@FindBy(id="exp-2")
	WebElement exp3;

	@FindBy(id="exp-3")
	WebElement exp4;

	@FindBy(id="exp-4")
	WebElement exp5;

	@FindBy(id="exp-5")
	WebElement exp6;

	@FindBy(id="exp-6")
	WebElement exp7;

	@FindBy(id="datepicker")
	WebElement dateTextBox;

	@FindBy(id="profession-0")
	WebElement manualCheckBox;

	@FindBy(id="profession-1")
	WebElement automationCheckBox;

	@FindBy(id="tool-0")
	WebElement qtpCheckBox;

	@FindBy(id="tool-1")
	WebElement selIdeCheckBox;

	@FindBy(id="tool-2")
	WebElement selWebDriverCheckBox;

	public SetFormValues(WebDriver driverInstance) {
		super(driverInstance);
	}

	public SetFormValues goToPage() {
		navigate("automation-practice-form/");
		return this;
	}

	public SetFormValues fillFirstName(String firstNameStr) {
		firstNameField.sendKeys(firstNameStr);
		return this;
	}

	public SetFormValues fillLastName(String lastNameStr) {
		lastNameField.sendKeys(lastNameStr);
		return this;
	}

	public SetFormValues selectSex(boolean boolMale) {
		if (boolMale) {
			maleRadioButton.click();
		} else {
			femaleRadioButton.click();
		}

		return this;
	}

	public SetFormValues selectYearsOfExperience(int yearsOfExperience) {
		switch(yearsOfExperience) {
		case 1:
			exp1.click();
			break;
		case 2:
			exp2.click();
			break;
		case 3:
			exp3.click();
			break;
		case 4:
			exp4.click();
			break;
		case 5:
			exp5.click();
			break;
		case 6:
			exp6.click();
			break;
		default:
			exp7.click();
			break;
		}

		return this;
	}

	public SetFormValues setDate(String dateValue) {
		dateTextBox.sendKeys(dateValue);

		return this;
	}

	public SetFormValues selectProfession(boolean boolManualTester, boolean boolAutomationTester) {
		if(boolManualTester) {
			manualCheckBox.click();
		}

		if(boolAutomationTester) {
			automationCheckBox.click();
		}

		return this;
	}

	public SetFormValues selectContinent(String continent) {
		new DropDownPageObject(driver).setDropDownList(continent);

		return this;
	}

	public SetFormValues multiSelectContinent(boolean boolAsia, boolean boolEurope, boolean boolAfrica, boolean boolAustralia,
			boolean boolSouthAmerica, boolean boolNorthAmerica, boolean boolAntartica) {

		WebElement mySelectElement = driver.findElement(By.id("continentsmultiple"));
		Select dropdown= new Select(mySelectElement);
		
		if (boolAsia) {
			dropdown.selectByIndex(0);
		}

		if (boolEurope) {
			dropdown.selectByIndex(1);
		}

		if (boolAfrica) {
			dropdown.selectByIndex(2);
		}

		if (boolAustralia) {
			dropdown.selectByIndex(3);
		}

		if (boolSouthAmerica) {
			dropdown.selectByIndex(4);
		}

		if (boolNorthAmerica) {
			dropdown.selectByIndex(5);
		}

		if (boolAntartica) {
			dropdown.selectByIndex(6);
		}

		return this;
	}

	public SetFormValues multiSelectSelenium(boolean boolBrowserCommands, boolean boolNavigationCommands,
			boolean boolSwitchCommands, boolean boolWaitCommands, boolean boolWebElementCommands) {
		
		WebElement mySelectElement = driver.findElement(By.id("selenium_commands"));
		Select dropdown= new Select(mySelectElement);
		
		if (boolBrowserCommands) {
			dropdown.selectByIndex(0);
		}

		if (boolNavigationCommands) {
			dropdown.selectByIndex(1);
		}

		if (boolSwitchCommands) {
			dropdown.selectByIndex(2);
		}

		if (boolWaitCommands) {
			dropdown.selectByIndex(3);
		}

		if (boolWebElementCommands) {
			dropdown.selectByIndex(4);
		}

		return this;
	}

	public String getUrl() {
		return driver.getCurrentUrl();
	}

	public SetFormValues selectAutomationTool(boolean boolQtp, boolean boolSeleniumIde, boolean boolSeleniumWebDriver) {
		if(boolQtp) {
			qtpCheckBox.click();

		}
		if(boolSeleniumIde) {
			selIdeCheckBox.click();
		}

		if(boolSeleniumWebDriver) {
			selWebDriverCheckBox.click();
		}

		return this;
	}

}
