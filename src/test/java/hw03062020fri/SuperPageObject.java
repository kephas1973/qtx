package hw03062020fri;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

//import ui.control.extensions.CheckboxGroup;


public class SuperPageObject {
	protected WebDriver driver;
    protected String baseUrl;
      
    //Constructor
    public SuperPageObject(WebDriver driver, String baseUrl) {
        this.driver = driver;
        this.baseUrl = baseUrl;
        
        PageFactory.initElements(driver, this);
    }

	protected void navigate(String url) {
		String pageUrl = new String(baseUrl + url);
		driver.navigate().to(pageUrl);		
	}
	
	protected Select getSelect(WebElement element) {
		return new Select(element);
	}
	
	protected CheckboxGroup getCheckboxGroup(By locator) {
		return new CheckboxGroup(driver.findElement(locator));
	}
}
