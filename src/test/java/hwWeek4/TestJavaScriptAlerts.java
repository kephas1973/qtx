package hwWeek4;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestJavaScriptAlerts extends TestSuperClass {
	
	@Test
	public void doJavaScriptAlerts() {
		//arrange
		String expectedAlert1 = new String("I am a JS Alert");
		String expectedResult1 = new String("You successfuly clicked an alert");
		
		String expectedAlert2 = new String("I am a JS Confirm");
		String expectedResult2 = new String("You clicked: Ok");
		
		//act
		String[] actualResults1 = new JSAlertObject1(driver)
				.goToPage()
				.clickAlert()
				.clickOK()
				.getResultsTexts();
		
		String[] actualResults2 = new JSAlertObject2(driver)
				.goToPage()
				.clickAlert()
				.clickOK()
				.getResultsTexts();
		
		//assert
		Assert.assertEquals(actualResults1[0], expectedAlert1, "Alert does not match!");
		Assert.assertEquals(actualResults1[1], expectedResult1, "Result does not match!");
		
		System.out.println("actuaResults2[0] = " + actualResults2[0]
				+ ", expectedAlert2 = " + expectedAlert2);
		Assert.assertEquals(actualResults2[0], expectedAlert2, "Alert does not match!");
		Assert.assertEquals(actualResults2[1], expectedResult2, "Result does not match!");
	}
}
