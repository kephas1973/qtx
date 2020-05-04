// https://www.vinsguru.com/selenium-webdriver-design-patterns-in-test-automation-factory-pattern/
// WEBDRIVER FACTORY PATTERN... SEE WEBSITE FOR OVERVIEW

package qtx;

import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.By;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.Assert;

public class TheInternet_1 extends TestSuperClass {

	// As a user
	// I want to select option 2 from a drop down list
	// So that some option is selected

	//public static String URL = new String ("http://the-internet.herokuapp.com/dropdown");
	protected static final String URL = new String ("http://the-internet.herokuapp.com/dropdown");

/*	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "c:\\\\chromedriver.exe");
		driver = new ChromeDriver();
		String url = "http://the-internet.herokuapp.com/login";
		driver.navigate().to(url);
	}*/

	@Test
	public void canSelectDropdownListItem() {
		
		// arrange
		String expectedSelection = new String("Option 2");

		// act
		//Selecting Items in a Multiple SELECT elements
		Select customerDropDownList = new Select(driver.findElement(By.id("dropdown")));
		//options.selectByVisibleText("Option 2");
		customerDropDownList.selectByIndex(2); // alternate option to the above statement

		// assert
		String actualOption2Text = customerDropDownList.getFirstSelectedOption().getText();

		Assert.assertEquals(actualOption2Text, expectedSelection, "Cannot select a dropdown list value!");
	}
}