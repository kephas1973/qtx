package hwweek4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class fetchFramesTexts extends PageObjectSuperClass {

	public fetchFramesTexts(WebDriver driverInstance) {
		super(driverInstance);
	}

	public fetchFramesTexts goToPage() {
		navigate("/nested_frames");
		return this;
	}

	// CANNOT LOCATE THESE ELEMENTS
	//@FindBy(name="frame-left")
	@FindBy(partialLinkText="LEFT")
	WebElement leftFrame;

	//@FindBy(name="frame-middle")
	//@FindBy(id="content")
	@FindBy(partialLinkText="MIDDLE")
	WebElement middleFrame;
	
	//@FindBy(name="frame-right")
	@FindBy(partialLinkText="RIGHT")
	WebElement rightFrame;
	
	//@FindBy(name="frame-bottom")
	@FindBy(partialLinkText="BOTTOM")
	WebElement bottomFrame;
	
	public String[] getText() {
		
		String[] actualFrameText = new String[] {"", "", "", ""};
		
		// NOT SURE IF DRIVER SWITCH IS NECESSARY AS I CANNOT LOCATE THE ELEMENTS
		driver.switchTo().frame(leftFrame);
		actualFrameText[0] = leftFrame.getText();
		
		driver.switchTo().frame(middleFrame);		
		actualFrameText[1] = middleFrame.getText();
		
		driver.switchTo().frame(rightFrame);
		actualFrameText[2] = rightFrame.getText();

		driver.switchTo().frame(bottomFrame);
		actualFrameText[3] = bottomFrame.getText();
		
		return actualFrameText;
	}

}
