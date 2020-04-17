package hwWeek7A;
//
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFillFormValues extends TestSuperClass {
	
	@Test
	public void fillFirstAndLastNames() {

		//arrange
		String firstName = new String("Robert");
		String lastName = new String("Rose");
		
		String expectedUrl = new String("https://demoqa.com/automation-practice-form/");
		
		//act
		String actualUrl = new SetFirstAndLastNames(driver)
				.goToPage()
				.fillFirstName(firstName)
				.fillLastName(lastName)
				.getUrl();
		
		//assert
		Assert.assertEquals(actualUrl, expectedUrl, "URLs do not match!");
	}

	
	@Test
	public void fillEntireForm() {
		//arrange
		String expectedUrl = new String("https://demoqa.com/automation-practice-form/");
		
		String firstName = new String("Robert");
		String lastName = new String("Rose");
		
		boolean boolMale = true;
		
		int yearsOfExperience = 7;
		
		String dateValue = new String("Tuesday, April 14th, 2020");
		
		boolean boolManualTester = true;
		boolean boolAutomationTester = true;
		
		String continent = new String("NA");
		//String continent = new String("EU");
		
		boolean boolQtp = true;
		boolean boolSeleniumIde = true;
		boolean boolSeleniumWebDriver = true;
		
		boolean boolAsia = true;
		boolean boolEurope = true;
		boolean boolAfrica = false;
		boolean boolAustralia = false;
		boolean boolSouthAmerica = false;
		boolean boolNorthAmerica = true;
		boolean boolAntartica = false;
		
		boolean boolBrowserCommands = true;
		boolean boolNavigationCommands = true;
		boolean boolSwitchCommands = true;
		boolean boolWaitCommands = true;
		boolean boolWebElementCommands = true;
		
		//act
		String actualUrl = new SetFormValues(driver)
				.goToPage()
				.fillFirstName(firstName)
				.fillLastName(lastName)
				.selectSex(boolMale)
				.selectYearsOfExperience(yearsOfExperience)
				.setDate(dateValue)
				.selectProfession(boolManualTester, boolAutomationTester)
				.selectAutomationTool(boolQtp, boolSeleniumIde, boolSeleniumWebDriver)
				.selectContinent(continent)
				.multiSelectContinent(boolAsia, boolEurope, boolAfrica, boolAustralia, boolSouthAmerica, boolNorthAmerica, boolAntartica)
				.multiSelectSelenium(boolBrowserCommands, boolNavigationCommands, boolSwitchCommands, boolWaitCommands, boolWebElementCommands)
				.getUrl();
		
		//assert
		Assert.assertEquals(actualUrl, expectedUrl, "URLs do not match!");
		
		
	}
}
