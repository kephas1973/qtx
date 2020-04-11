package hwWeek7;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestShadowDom extends TestSuperClass {
	
	@Test
	public void shadowDomText() {
		
		//arrange
		String[] expectedText = new String[] {"Simple template", "Let's have some different text!", "Let's have some different text!", "In a list!"};
		
		//act
		String[] actualText = new GetShadowDomText(driver)
				.goToPage()
				.getOutputText();
		
		//assert
		for (int i = 0; i < expectedText.length; i++) {
			System.out.println("expected = " + expectedText[i]+ ", actual = " + actualText[i]);
		}
		
		Assert.assertEquals(actualText, expectedText, "Mismatch error!");
		
	}
}
