package hw03062020fri;

import org.testng.Assert;
//import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
/*
import test.TestSuperClass;
import test.pages.CheckboxPage;
import test.pages.DropdownListPage;
import test.pages.HomePage;
import test.pages.LoginPage;
*/

import courseProject.BestSellersView;

public class TheInternet extends TestSuperClass {
/*	
	//As a 'Customer'
	//I want to 'Show Best Sellers on the home page'
	//So that I can view it
	@Test
	public void canViewBestSellersPage() {
		//arrange
		//String expectedClassActive = "active";
		String expectedPageTitle = "My Store";
		
		//act
		//String actualClassActive = "";
		/*String actualClassActive = new BestSellersView(driver, baseUrl)
				.navigate();
		*/
		/*
		String actualPageTitle = new BestSellersView(driver, baseUrl)
				.navigate()
				.GetTitle();
		
		//assert
		//Assert.assertEquals(actualClassActive, expectedClassActive, "Best Sellers View Cannot Be Determined!");
		Assert.assertEquals(actualPageTitle, expectedPageTitle, "Could not navigate to URL");
	}
*/	
	
	/*
	//As a user
	//I want to enter values in the input box
	//So that I can prove I know how to use data provider
	@Test(dataProvider="numberData")
	//arrange
	
	//act
	public void canInputNumbers(int number) {
		int actualNumberInput = new InputPage(driver, baseUrl)
				.navigate()
				.setInputValue(number)
				.getInputValue();
	}
	
	@DataProvider(name="numberData")
	public Object[] getNumberData() {
		return new Object[] {1, 5, 3, 0, 9, 7};
	}
	*/
	/*
	//As a user
	//I want to move the slider to the maximum value
	//So that I can prove I can automate mouse actions
	public void canMoveSliderToMaxRange() {
		
		//arrange
		float expectedSliderValue = 5f;
		
		//act
		float actualSliderValue = new SliderPage(driver, baseUrl)
				.navigate()
				.getSliderMaxValue()
				.geSliderValue();
		
		//assert
		Assert.assertEquals(actualSliderValue, expectedSliderValue, "The slider values are mismatched!");
	}
	*/
	/*
	//As a user
	//I want to move the slider to the max value
	//So I can prove that I know how to use the Actions builder
	@Test
	public void canInspectSliderMaxValue() {

		//arrange
		//String expectedSliderMaxValue = "5";
		Float expectedSliderMaxValue = "5.0f";
		
		//act
		String actualSliderMaxValue = new SliderPage(driver, baseUrl)
				.navigate()
				.moveSliderToMaxValue()
				.GetSliderMaxValue();
		
		//assert
		Assert.assertEquals(actualSliderMaxValue, expectedSliderMaxValue, "Cannot set slider to maximum value of 5!");
	}
	*/
	/*
	//As a SDET
	//I want navigate to the website
	//So that I know I can create the webdriver object 
	@Test
	public void canLaunchChromeDriver() {	
		//arrange
		String expectedPageTitle = "The Internet";

		//act
		String actualPageTitle = new HomePage(driver, baseUrl)
			.navigate()
			.GetTitle();
		
		//assert
		Assert.assertEquals(actualPageTitle , expectedPageTitle, "Could not navigate to the url"); 
	}
	*/
	/*
	//As a user
	//I want select option 2 from the dropdownlist 
	//so that an option is selected
	@Test
	public void CanSelectDropdownListItem() {
		//arrange
		String expectedSelection = "Option 2";
		
		//act
		String selectionOptionText = new DropdownListPage(driver, baseUrl)
			.navigate()
			.SelectOption(expectedSelection)
			.GetSelectedDropdownlistItemText();			
		
		//assert
		Assert.assertEquals(selectionOptionText,  expectedSelection, "Cannot select a dropdown list value.");
	}
	*/
	/*
	//As a user 
	//I want to login 
	//So that users can do stuff
	@Test
	public void CanLogIn() {
		//arrange
		String userName = "tomsmith";
		String userPassword = "SuperSecretPassword!";
		String expectedMessage = "You logged into a secure area!\n×";
				
		//act
		String flashMessageText = new LoginPage(driver, baseUrl)
			.navigate()	
			.Login(userName, userPassword)
			.GetMessageText();

		//assert
		Assert.assertEquals(flashMessageText, expectedMessage);
	}
	*/
	/*
	//As a user
	//I want to toggle the checkboxes on the checkbox page
	//So that I can prove I know how
	@Test
	public void CanToggleCheckboxes() {
		//arrange
		boolean isChecked1expected = true;
		boolean isChecked2expected = false;
		
		//act
		CheckboxPage page = new CheckboxPage(driver, baseUrl)
			.navigate()
			.setCheckbox1(isChecked1expected)
			.setCheckbox2(isChecked2expected);
				
		boolean actual1 = page.getCheckbox1Checked();
		boolean actual2 = page.getCheckbox2Checked();
		
		//assert	
		Assert.assertEquals(actual1, isChecked1expected);
		Assert.assertEquals(actual2, isChecked2expected);
	}
	*/
}
