package hwWeek7;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GetShadowDomText extends PageObjectSuperClass {
	
	@FindBy(how=How.TAG_NAME, using="my-paragraph")
	List<WebElement> myShadowParagraphs;
	
	@FindBy(how=How.ID, using="my-paragraph")
	WebElement template;
	
	public GetShadowDomText(WebDriver driverInstance) {
		super(driverInstance);
	}
	
	public GetShadowDomText goToPage() {
		navigate("/shadowdom");
		return this;
	}

	public String[] getPageText() {
		
		List<String> lineTexts = new ArrayList<String>();
		
		lineTexts.add(template.getText());		
		
		for(WebElement myShadowParagraph : myShadowParagraphs) {
			
			String text = getTextForShadowDomParagraph(myShadowParagraph);
			
			lineTexts.add(text);
		}
		
		return (String[]) lineTexts.toArray();
	}

	private String getTextForShadowDomParagraph(WebElement element) {

		WebElement shadowRoot = getShadowRoot(element);
			
		return shadowRoot.findElement(By.cssSelector("span[slot='my-text']")).getText();
	}

	public WebElement getShadowRoot(WebElement element) {
		
		WebElement rootElement = 
				(WebElement)((JavascriptExecutor) driver)
				.executeScript("return arguments[0].shadowRoot", element);
		
		return rootElement;
	}
	
}
