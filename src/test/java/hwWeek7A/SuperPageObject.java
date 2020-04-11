package hwWeek7A;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

//import ui.control.extensions.CheckboxGroup;
//import ui.control.extensions.NumericInput;
//import ui.control.extensions.Slider;


public class SuperPageObject {
	protected WebDriver driver;
	protected String baseUrl;
	protected String url;

	public SuperPageObject(WebDriver driver, String baseUrl) {
		this.driver = driver;
		this.baseUrl = baseUrl;

		PageFactory.initElements(driver, this);
	}

	protected void navigate(String string) {
		String pageUrl = new String(baseUrl + url);
		driver.navigate().to(pageUrl);		
	}

	protected Select getSelect(WebElement element) {
		return new Select(element);
	}
/*
	protected CheckboxGroup getCheckboxGroup(By locator) {
		return new CheckboxGroup(driver, driver.findElement(locator));
	}

	protected Slider getSlider(By locator) {
		return new Slider(driver, driver.findElement(locator));
	}

	protected NumericInput getNumericInput(By locator) {
		return new NumericInput(driver, driver.findElement(locator));
	}

	public void closeTabAndSwitchTo(String returnToWindowHandle) {
		driver.close();
		driver.switchTo().window(returnToWindowHandle);

		String currentWindowHandle = driver.getWindowHandle();

		if(currentWindowHandle.contentEquals(returnToWindowHandle)) {
			return;
		}
		
		throw new RuntimeException(new Exception("Did not switch to window with handle " + returnToWindowHandle));
	}
*/
}
