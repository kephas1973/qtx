// https://www.guru99.com/page-object-model-pom-page-factory-in-selenium-ultimate-guide.html
// PAGE OBJECT MODEL (POM) & PAGE FACTORY: SELENIUM WEBDRIVER TUTORIAL
// SEE FILE: "Screen Shots - Wednesday 4th March 2020.docx"

package hw03042020wed;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TheInternet_1 extends TestSuperClass {
	// As a user
	// I want to log in
	// So that users can do stuff
	
	private WebDriver driver;
	
  @Test
  public void canLogIn() {
	  
	  //String url = "http://the-internet.herokuapp.com/login"; // ? url value
	  //driver.navigate().to(url);
	  
	  // arrange
	  String userName = new String("tomsmith");
	  String password = new String("SuperSecretPassword!");
	  String expectedGreenBoxText = new String("You logged into a secure area!\n×");
	  
	  // act
	  String actualGreenBoxText = new LoginPageObject(driver, url) // ? url value
			  .OpenLoginPage()
			  .login(userName, password)
			  .getLoginConfirmationMessage();
	  
	  // assert
	  Assert.assertEquals(actualGreenBoxText, expectedGreenBoxText, "Cannot Log in!");
  }
}
