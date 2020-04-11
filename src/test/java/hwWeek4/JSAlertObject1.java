package hwWeek4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JSAlertObject1 extends PageObjectSuperClass {

	public JSAlertObject1(WebDriver driverInstance) {
		super(driverInstance);
	}

	public JSAlertObject1 goToPage() {
		navigate("/javascript_alerts");
		return this;
	}

	@FindBy(xpath="//*[@id=\"content\"]/div/ul/li[1]/button")
	private WebElement JSAlertButton;
	
	public JSAlertObject1 clickAlert() {
		JSAlertButton.click();
		return this;
	}

	@FindBy(xpath="/div/ul/li[1]/button")
	private WebElement JSAlertOKButton;

	String alertText;
	String resultText;
	
	public JSAlertObject1 clickOK() {
		JSAlertOKButton.click();
		WebDriverWait wait = new WebDriverWait(driver, 2);
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		alertText = driver.switchTo().alert().getText();
		resultText = driver.findElement(By.id("result")).getText();
		return this;
	}

	public String[] getResultsTexts() {
		String[] returnTexts = new String[] {"", ""};

		returnTexts[0] = alertText;
		returnTexts[1] = resultText;

		driver.switchTo().alert().dismiss();
		
		return returnTexts;
	}
	

}
