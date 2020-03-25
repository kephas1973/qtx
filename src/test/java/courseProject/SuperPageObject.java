package courseProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;



public class SuperPageObject {
	protected WebDriver driver;
    protected String baseUrl = "http://automationpractice.com/index.php";
      
    //Constructor
    public SuperPageObject(WebDriver driver) {
        this.driver = driver;
        
        PageFactory.initElements(driver, this);
    }

	protected void navigate(String url) {
		String pageUrl = new String(baseUrl + url);
		driver.navigate().to(pageUrl);		
	}
	
	protected void navigate() {
		//driver.navigate().to(baseUrl);
		driver.get(baseUrl);
	}
	
	protected Select getSelect(WebElement element) {
		return new Select(element);
	}

/*
	protected CheckboxGroup getCheckboxGroup(By locator) {
		return new CheckboxGroup(driver.findElement(locator));
	}
*/
}
