package hwWeek7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GetCount extends PageObjectSuperClass {
	
	int count = 0;
	
	@FindBy(xpath="//*[@id=\"content\"]/div/button")
	WebElement addElement;

	public GetCount(WebDriver driverInstance) {
		super(driverInstance);
	}
	
	@FindBy(xpath="//*[@id=\"elements\"]/button[3]")
	WebElement removeElement3;
	
	@FindBy(xpath="//*[@id=\"elements\"]/button[2]")
	WebElement removeElement2;
	
	@FindBy(xpath="//*[@id=\"elements\"]/button[1]")
	WebElement removeElement1;

	public GetCount goToPage() {
		navigate("/add_remove_elements/");
		return this;
	}

	public GetCount clickToAddElements() {
		for (int i = 0; i < 3; i++) {
			addElement.click();
			count++;
		}
		
		return this;
	}

	public GetCount clickToRemoveElements() {
		removeElement3.click();
		removeElement2.click();
		removeElement1.click();
		
		count -= 3;
		
		return this;
	}

	public int returnCount() {
		return count;
	}
}
