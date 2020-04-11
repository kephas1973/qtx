package hwWeek7;

import java.awt.AWTException;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestExitIntent extends TestSuperClass {
	
	@Test
	public void exposeModalWindow() throws AWTException {
		//arrange
		String expectedModalWindowHeading = new String("THIS IS A MODAL WINDOW");
		
		//act
		String actualModalWindowHeading = new getModalWindowHeading(driver)
				.goToPage()
				.moveCursorOffTopOfScreen()
				.getHeading();
		
		//assert
		//System.out.println("expectedModalWindowHeading:" + expectedModalWindowHeading + "...");
		//System.out.println("actualModalWindowHeading:"+ actualModalWindowHeading + "...");
		
		Assert.assertEquals(actualModalWindowHeading, expectedModalWindowHeading, "Headings do not match!");
	}
}
