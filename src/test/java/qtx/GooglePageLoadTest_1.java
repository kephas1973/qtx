package qtx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class GooglePageLoadTest_1 {
	
	private WebDriver driver;
	
  @Test
  public void canClickLuckyButton() {
	  WebElement element = driver.findElement(By.id("gbqfbb"));
	  element.click();
  }
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "c:\\\\chromedriver.exe");
	  driver = new ChromeDriver();
	  String url = "http://www.google.com";
	  driver.navigate().to(url);
  }

  @AfterTest
  public void afterTest() {
	  //driver.quit();
  }

}
