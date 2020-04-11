package hwWeek7;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNotificationMessages extends TestSuperClass {
	
	@Test
	public void canGetNotificationMessage() {
		
		//arrange
		String expectedSuccessfulMsg = new String("Action successful\n" + 
				"×");
		String expectedUnsuccessfulMsg =  new String("Action unsuccesful, please try again\n" + 
				"×");
		
		//act
		String actualMessage = new GetNotificationMessage(driver)
				.goToPage()
				.clickHere()
				.getMessageText();
		
		//assert
		//System.out.println("expectedSuccessfulMsg:" + expectedSuccessfulMsg + "...");
		//System.out.println("expectedUnsuccessfulMsg:" + expectedUnsuccessfulMsg + "...");
		System.out.println("actualMessage:" + actualMessage + "...");
		
		if (expectedSuccessfulMsg.equals(actualMessage)) {
			Assert.assertEquals(actualMessage, expectedSuccessfulMsg, "Successful messages do not match!");
		} else {
			Assert.assertEquals(actualMessage, expectedUnsuccessfulMsg, "Unsuccessful messages do not match!");
		}
		
	}
}
