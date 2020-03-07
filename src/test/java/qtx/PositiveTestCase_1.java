package qtx;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class PositiveTestCase_1 {
	
	private WebDriver driver;
	
// As a 'Customer'
// I want to 'Access the web site' (http://automationpractice.com/index.php)
// So that 'I can view it and possibly make purchases'
	
  @Test
  public void f() {
  }
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

}
