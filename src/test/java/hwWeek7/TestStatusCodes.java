package hwWeek7;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestStatusCodes extends TestSuperClass {

	@Test
	public void returnStatusCode200() {
		//arrange
		String expectedStatusCode = "200";

		//act
		String actualStatusCode = new RequestStatusCode(driver)
				.goToPage()
				.clickStatusCodeLink(expectedStatusCode)
				.getUrl();

		//assert
		System.out.println("expectedStatusCode = " + expectedStatusCode + ", actualStatusCode = " + actualStatusCode);
		Assert.assertEquals(actualStatusCode, expectedStatusCode, "Status code mismatch!");

	}
	
	@Test
	public void returnStatusCode301() {
		//arrange
		String expectedStatusCode = "301";

		//act
		String actualStatusCode = new RequestStatusCode(driver)
				.goToPage()
				.clickStatusCodeLink(expectedStatusCode)
				.getUrl();

		//assert
		System.out.println("expectedStatusCode = " + expectedStatusCode + ", actualStatusCode = " + actualStatusCode);
		Assert.assertEquals(actualStatusCode, expectedStatusCode, "Status code mismatch!");

	}
	
	@Test
	public void returnStatusCode404() {
		//arrange
		String expectedStatusCode = "404";

		//act
		String actualStatusCode = new RequestStatusCode(driver)
				.goToPage()
				.clickStatusCodeLink(expectedStatusCode)
				.getUrl();

		//assert
		System.out.println("expectedStatusCode = " + expectedStatusCode + ", actualStatusCode = " + actualStatusCode);
		Assert.assertEquals(actualStatusCode, expectedStatusCode, "Status code mismatch!");

	}
	
	@Test
	public void returnStatusCode500() {
		//arrange
		String expectedStatusCode = "500";

		//act
		String actualStatusCode = new RequestStatusCode(driver)
				.goToPage()
				.clickStatusCodeLink(expectedStatusCode)
				.getUrl();

		//assert
		System.out.println("expectedStatusCode = " + expectedStatusCode + ", actualStatusCode = " + actualStatusCode);
		Assert.assertEquals(actualStatusCode, expectedStatusCode, "Status code mismatch!");
		
	}
}
