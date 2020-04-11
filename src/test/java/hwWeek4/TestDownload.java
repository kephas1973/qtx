package hwWeek4;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDownload extends TestSuperClass {

	@Test
	public void downloadFileThenPrint() {
		
		//arrange
		String expectedTextOutput = new String("text");
		
		//act
		String actualTextOutput =  new selectTextThenPrintFileContents(driver)
				.goToPage()
				.clickTextFileToDownload()
				.openTextFile()
				.readContents()
				.printContentsToScreen()
				.closeFile()
				.returnContents();
		
		//assert
		Assert.assertEquals(actualTextOutput, expectedTextOutput, "Texts do not match!");
		
	}
}
