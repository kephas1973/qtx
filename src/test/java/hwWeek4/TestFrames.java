package hwWeek4;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestFrames extends TestSuperClass {
	
	protected int arrayLength;
	
	@Test
	public void getFramesTexts() {
		//arrange
		String[] expectedFrameText = new String[] {"LEFT", "MIDDLE", "RIGHT", "BOTTOM"};
		arrayLength = expectedFrameText.length;
		
		//act
		String[] actualFrameText = new fetchFramesTexts(driver)
				.goToPage()
				.getText();
		
		//assert
		for ( int i = 0; i < expectedFrameText.length; i++) {
			Assert.assertEquals(actualFrameText[i], expectedFrameText[i], "Texts do not match for index = [" + i + "]");
			System.out.println("actualFrameText[" + i + "] = " + actualFrameText[i]
					+ ", expectedFrameText[" + i + "] = " + expectedFrameText[i]);
		}
		
	}
}
