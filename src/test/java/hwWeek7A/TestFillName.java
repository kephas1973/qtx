package hwWeek7A;

import org.testng.annotations.Test;

public class TestFillName extends TestSuperClass {
	
	@Test
	public void fillFirstAndLastNames() {

		new SetFirstAndLastNames(driver, baseUrl)
				.navigate()
				.fillFirstName()
				.fillLastName();
	}
}
