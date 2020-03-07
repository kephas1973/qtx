package qtx;

//import static org.junit.jupiter.api.Assertions.*;

//import org.junit.jupiter.api.Test;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class GooglePageLoadTest {
	public static void main( String[] args ) {
		
		String url = "http://www.google.com";
		
  	  	System.setProperty("webdriver.chrome.driver", "c:\\\\chromedriver.exe");
  	  	
  	  	WebDriver driver = new ChromeDriver();
  	  	
  	  	driver.navigate().to(url);
  	  	
  	  	Assert.assertEquals(driver.getTitle(), url);
  	  	
  	  	driver.quit();
  	  	
  	  	driver.close();

	}
}



/*
class SauceLabsHomePageTest {
          @Test
          public void site_header_is_on_home_page() {

//        	  System.setProperty("webdriver.chrome.driver", "/opt/local/bin/chromedriver");
        	  System.setProperty("webdriver.chrome.driver", "c:\\\\chromedriver.exe");
              WebDriver browser = new ChromeDriver();
              browser.get("https://www.saucelabs.com");
              WebElement href = browser.findElement(By.xpath("//a[@href='/beta/login']"));
              assertTrue((href.isDisplayed()));

              browser.close();       

          }

}
*/