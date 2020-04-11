package hwWeek7;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class MoveElement extends PageObjectSuperClass {

	@FindBy(id="column-a")
	//@FindBy(xpath="/html/body/div[2]/div/div/div/div[1]")	
	WebElement columnA;

	@FindBy(id="column-b")
	//@FindBy(xpath="/html/body/div[2]/div/div/div/div[2]")
	WebElement columnB;
	
	public MoveElement(WebDriver driverInstance) {
		super(driverInstance);
	}

	public MoveElement goToPage() {
		navigate("/drag_and_drop");
		return this;
	}

	public MoveElement clickADragToB() {	
		Actions action = new Actions(driver);
		Action dragDrop = action.dragAndDrop(columnA, columnB).build();
//		int xOffset = columnA.getLocation().getX() + 90;
//		Action dragDrop = action.dragAndDropBy(columnA, xOffset, 0).release(columnB).build();
		dragDrop.perform();
		
		return this;
	}

	public String getColumnBHeading() {
		return columnB.getText();
	}

	public MoveElement clickBDragToA() {	
		Actions action = new Actions(driver);
		action.dragAndDrop(columnB, columnA).build().perform();	
		return this;
	}

	public String getColumnAHeading() {
		return columnA.getText();
	}

}
