package hwWeek4;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestTables extends TestSuperClass {
	
	@Test
	public void getValueFromTable() {
		//arrange
		String expectedAmountDue = new String("$100.00");
		
		//act
		String actualAmountDue = new getValue(driver)
				.goToPage()
				.getDollarAmount();
		
		//assert
		Assert.assertEquals(actualAmountDue, expectedAmountDue, "Amount due for jdoe@hotmail.com does not match!");
		
		//System.out.println("actualAmountDue = " + actualAmountDue + ", expectedAmountDue = " + expectedAmountDue);
	}
}
