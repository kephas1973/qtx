package courseProject;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class RunTests extends TestSuperClass {

	private WebDriver driver;
	
	//As a 'Customer'
	//I want to 'Show Best Sellers on the home page'
	//So that I can view it
	@Test
	public void canViewBestSellersPage() {
		//act
		String expectedButtonText = "BEST SELLERS";

		//arrange
		String actualButtonText = new BestSellersView(driver)
				.GoToPage()
				.GetTitle();
		
		//assert
		Assert.assertEquals(actualButtonText, expectedButtonText, "Could not navigate to URL");
	}
	
	
/*
	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "c:\\\\chromedriver.exe");
		driver = new ChromeDriver();
		String url = "http://automationpractice.com/index.php";
		driver.navigate().to(url);
	}

	@AfterTest
	public void afterTest() {
		//driver.quit();
	}
*/
}
