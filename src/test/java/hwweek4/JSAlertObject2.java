package hwweek4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JSAlertObject2 extends PageObjectSuperClass {

	public JSAlertObject2(WebDriver driverInstance) {
		super(driverInstance);
	}

	public JSAlertObject2 goToPage() {
		navigate("/javascript_alerts");
		return this;
	}

	@FindBy(xpath="//*[@id=\"content\"]/div/ul/li[2]/button")
	private WebElement JSConfirmButton;

	public JSAlertObject2 clickAlert() {
		JSConfirmButton.click();
		return this;
	}

	//@FindBy(xpath="/div/ul/li[3]/button")
	@FindBy(xpath="#content > div > ul > li:nth-child(1) > button")
	private WebElement JSConfirmOKButton;

	String alertText;
	String resultText;
	
	public JSAlertObject2 clickOK() {
		JSConfirmOKButton.click();
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
		
		return returnTexts;
	}
	
	
}
