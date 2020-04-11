package hwWeek7;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;

public class GetShadowDomText extends PageObjectSuperClass {

	public GetShadowDomText(WebDriver driverInstance) {
		super(driverInstance);
	}

	public GetShadowDomText goToPage() {
		navigate("/shadowdom");
		return this;
	}

	public String[] getOutputText() {
		
		String[] expectedText = new String[] {"", "", "", ""};
		
        WebElement simpleTemplateText = driver.findElement(By.xpath("//*[@id=\"content\"]/h1"));
        //?WebElement simpleTemplateText = driver.findElement(By.id("content"));
		//?WebElement shadowSimpleTemplateText = expandRootElement(simpleTemplateText);
		//?expectedText[0] = shadowSimpleTemplateText.getText();
        expectedText[0] = simpleTemplateText.getText();
        System.out.println(expectedText[0]);
		
		WebElement diffTextStandAloneText = driver.findElement(By.xpath("//*[@id=\"content\"]/my-paragraph[1]/span"));
		//WebElement diffTextStandAloneText = driver.findElement(By.id("my-paragraph"));
		WebElement shadowDiffTextStandAloneText = expandRootElement(diffTextStandAloneText);
		expectedText[1] = shadowDiffTextStandAloneText.getText();
		
		//WebElement diffTextInListText = driver.findElement(By.xpath("//*[@id=\"content\"]/my-paragraph[2]/ul/li[1]"));
		WebElement diffTextInListText = driver.findElement(By.id("my-paragraph"));
		WebElement shadowDiffTextInListText = expandRootElement(diffTextInListText);
		expectedText[2] = shadowDiffTextInListText.getText();
		
		//WebElement inAListText = driver.findElement(By.xpath("//*[@id=\"content\"]/my-paragraph[2]/ul/li[2]"));
		WebElement inAListText = driver.findElement(By.id("my-paragraph"));
		WebElement shadowInAListText = expandRootElement(inAListText);
		expectedText[3] = shadowInAListText.getText();
		
		return expectedText;
	}

	//Returns webelement
	public WebElement expandRootElement(WebElement element) {
		WebElement ele = (WebElement) ((JavascriptExecutor) driver)
				.executeScript("return arguments[0].shadowRoot",element);
		return ele;
	}
	
}
