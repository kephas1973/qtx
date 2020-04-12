package myStoreStepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

import myStoreStepDefinitions.PageObjectSuperClass;
import myStoreStepDefinitions.TileObjectSuperClass;
import myStoreStepDefinitions.DriverType;
import myStoreStepDefinitions.DriverManagerFactory; 

public class stepDefinition {
	
	protected WebDriver driver = DriverManagerFactory.getManager(DriverType.CHROME).getDriver();

	@Given("^user is logged onto the My Store website as a guest user$")
	public void user_is_on_Home_Page() {
		new PageObjectSuperClass(driver).navigate();
	}

	@When("^user adds 1 items to the cart$")
	public void user_adds_1_item() {
		String Tile1 = "//*[@id=\"homefeatured\"]/li[1]";
		new TileObjectSuperClass(driver).addToCart(Tile1).checkout();
	}

	@And("^user adds 10 more of the same item via the cart summary page$")
	public void user_adds_10_more_items() {
		for (int i = 0; i < 10; i++) {
			driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div[2]/table/tbody/tr/td[5]/div/a[2]/span")).click();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			e.printStackTrace();
			}
		}
	}
	
// had to comment this because 	CartContentPageTUQVP class could not be found.
//	@Then("^user asserts that the total of all items is indeed correct$")
//	public void user_asserts_total_is_correct() {
//		String expectedTotalPrice = new String("$181.61");
//		String actualTotalPrice = new CartContentPageTUQVP(driver).totalPrice();
//		
//		// HOW DO YOU ASSERT IN CUCUMBER? -- done below!
//		if (expectedTotalPrice.equals(actualTotalPrice)) {
//			System.out.println("Total price is indeed $181.61");
//		}
//		
//		Assert.assertEquals(actualTotalPrice, expectedTotalPrice, "Total prices do not match!");	
//	}

}