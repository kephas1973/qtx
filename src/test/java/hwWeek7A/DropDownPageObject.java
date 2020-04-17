package hwWeek7A;
//
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DropDownPageObject extends PageObjectSuperClass {

	public DropDownPageObject(WebDriver driverInstance) {
		super(driverInstance);
	}

	public DropDownPageObject setDropDownList(String value) {
		if(value.equalsIgnoreCase("NA")) {
			WebElement dropDown = driver.findElement(By.xpath("//*[@id='continents']/option[6]"));
			dropDown.click();
		}
		
		if(value.equalsIgnoreCase("EU")) {
			WebElement dropDown = driver.findElement(By.xpath("//*[@id='continents']/option[2]"));
			dropDown.click();
		}
		
		return this;
	}
}
