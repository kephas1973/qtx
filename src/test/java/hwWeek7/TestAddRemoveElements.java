package hwWeek7;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAddRemoveElements extends TestSuperClass {
	
	@Test
	public void addRemoveElements() {
		// arrange
		int expectedElementCount = 0;
		
		// act
		int actualElementCount = new GetCount(driver)
				.goToPage()
				.clickToAddElements()
				.clickToRemoveElements()
				.returnCount();
		
		// assert
		Assert.assertEquals(actualElementCount, expectedElementCount, "Element counts do not match!");
		
		
	}
}
