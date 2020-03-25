package hw03062020fri;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BestSellersView extends SuperPageObject {

//	private WebElement bestSellersTab = driver.findElement(By.xpath("//*[@id='home-page-tabs']/li[2]/a"));
	private WebElement bestSellersButton = driver.findElement(By.className("blockbestsellers"));
	//@FindBy(className="blockbestsellers")
	//WebElement bestSellersButton;
	
	public BestSellersView(WebDriver driver, String baseUrl) {
		super(driver, baseUrl);
	}

	public BestSellersView navigate() {
		super.navigate("");
		
		return this;
		//return null;
	}
	
	public String GetTitle() {
		//bestSellersButton.click();

		System.out.println(bestSellersButton.getText());
		
		return driver.getTitle();
	}

}
