package courseProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BestSellersView extends SuperPageObject {

	private WebElement bestSellersButton = driver.findElement(By.className("blockbestsellers"));

	public BestSellersView(WebDriver driver) {
		super(driver);
	}
	
	public BestSellersView GoToPage() {
		navigate();
		
		return this;
	}
	
	public String GetTitle() {
		System.out.println(bestSellersButton.getText());
		
		return bestSellersButton.getText();
	}

}
