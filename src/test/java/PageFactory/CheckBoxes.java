package PageFactory;
//package /hw03042020/PageFactory;

//import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class CheckBoxes {
	
	WebDriver driver;
	
	@FindBy(id="checkboxes")
	WebElement checkBoxList;
	
  //@Test
  public CheckBoxes(WebDriver driverInstance) {
	  this.driver = driverInstance;
	  // THis initELements method will create all WEbElements
	  PageFactory.initElements(driverInstance, this);
  }
}
