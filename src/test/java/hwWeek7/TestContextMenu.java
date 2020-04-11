package hwWeek7;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestContextMenu extends TestSuperClass {
	
	@Test
	public void contextMenuAnimate() {
		// arrange
		String expectedAlert = new String("You selected a context menu");
		
		// act
		String actualAlert = new RightClickContext(driver)
				.goToPage()
				.rightClick()
				.handleJSAlert();
		
		// assert
		Assert.assertEquals(actualAlert, expectedAlert, "JS Script Alerts do not match!");
		
	}
}
