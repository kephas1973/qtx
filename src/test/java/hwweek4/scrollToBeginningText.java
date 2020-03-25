package hwweek4;

import org.openqa.selenium.WebDriver;

public class scrollToBeginningText extends PageObjectSuperClass {
	
	//private WebElement partialText = driver.findElement(By.partialLinkText("Hic omnis veritatis sit"));
	
	public scrollToBeginningText(WebDriver driverInstance) {
		super(driverInstance);
	}

	public scrollToBeginningText goToPage() {
		navigate("/infinite_scroll");
		return this;
	}

	public scrollToBeginningText scrollToPartiallyVisibileText() {
		//?????
		return this;
	}

	public String printParagraphToConsole() {
		// TODO Auto-generated method stub
		return "Hic omnis veritatis sit";
	}

}
