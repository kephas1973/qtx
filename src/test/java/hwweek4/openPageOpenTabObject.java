package hwweek4;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class openPageOpenTabObject extends PageObjectSuperClass {

	@FindBy(xpath="//*[@id=\"content\"]/div/a")
	private WebElement clickHere;

	private String newTabTextStr = new String("");

	public openPageOpenTabObject(WebDriver driverInstance) {
		super(driverInstance);
	}

	public openPageOpenTabObject goToPage() {
		navigate("/windows");
		return this;
	}

	public openPageOpenTabObject clickClickHere() {
		clickHere.click();
		return this;
	}

	public openPageOpenTabObject readTextFromNewTab() {
		
		String first_handle = driver.getWindowHandle();
		new WebDriverWait(driver,5).until(ExpectedConditions.numberOfWindowsToBe(2));
		Set<String> allHandles = driver.getWindowHandles();
		for(String winHandle:allHandles)
		{
		    if (!first_handle.equalsIgnoreCase(winHandle))
		    {
		        driver.switchTo().window(winHandle);
		    }
		}
		
		WebElement newTabText = driver.findElement(By.xpath("/html/body/div/h3"));
		System.out.println(newTabTextStr = newTabText.getText());
		return this;
	}

	public openPageOpenTabObject closeNewTab() {
		driver.close();
		return this;
	}

	public String sendTextFoundInNewTab() {
		return newTabTextStr;
	}

}
