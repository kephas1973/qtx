package hwWeek4;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestWindowCloseTab extends TestSuperClass {

	@Test
	public void windowCloseTab() {
		//arrange
		String expectedNewTabText = "New Window";
		
		//act
		String actualNewTabText = new openPageOpenTabObject(driver)
				.goToPage()					// http://the-internet.herokuapp.com/windows
				.clickClickHere()			// open new tab
				.readTextFromNewTab()		// should be "New Window"
				.closeNewTab()				// Switch focus back to new window
				.sendTextFoundInNewTab();	// return "New Window"
		
		//assert
		Assert.assertEquals(actualNewTabText, expectedNewTabText, "New tab message does not match!");		
		
	}
}
