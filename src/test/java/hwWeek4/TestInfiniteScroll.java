package hwWeek4;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestInfiniteScroll extends TestSuperClass {

	@Test
	public void infiniteScrollTillTextFound() {
		//arrange
		String expectedBeginningText = new String("Hic omnis veritatis sit");
		
		//act
		String actualBeginningText = new scrollToBeginningText(driver)
				.goToPage()
				.scrollToPartiallyVisibileText()
				.printParagraphToConsole();
		
		//assert
		Assert.assertEquals(actualBeginningText, expectedBeginningText, "Beginning texts do not match!");
	}
}
