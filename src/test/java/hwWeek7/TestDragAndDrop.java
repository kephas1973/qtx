package hwWeek7;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDragAndDrop extends TestSuperClass {

	@Test
	public void dragAToB() {
		//arrange
		String expectedColumnBHeading = new String("A");

		//act
		String actualColumnBHeading = new MoveElement(driver)
				.goToPage()
				.clickADragToB()
				.getColumnBHeading();

		//assert
		Assert.assertEquals(actualColumnBHeading, expectedColumnBHeading, "Column headings do not match!");
	}
/*
	@Test
	public void dragBToA() {
		//arrange
		String expectedColumnAHeading = new String("B");

		//act
		String actualColumnAHeading = new MoveElement(driver)
				.goToPage()
				.clickBDragToA()
				.getColumnAHeading();

		//assert
		Assert.assertEquals(actualColumnAHeading, expectedColumnAHeading, "Column headings do not match!");
	}
*/
}
