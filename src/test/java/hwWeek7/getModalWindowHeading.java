package hwWeek7;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.concurrent.TimeUnit;

//import org.openqa.selenium.By;
//import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Action;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class getModalWindowHeading extends PageObjectSuperClass {

	@FindBy(xpath="//*[@id=\"ouibounce-modal\"]/div[2]/div[1]/h3")
	WebElement modalWindowHeading;

	public getModalWindowHeading(WebDriver driverInstance) {
		super(driverInstance);
	}

	public getModalWindowHeading goToPage() {
		navigate("/exit_intent");
		return this;
	}

	public getModalWindowHeading moveCursorOffTopOfScreen() throws AWTException {

		Robot robot = new Robot();

		robot.mouseMove(200, 200);
		long time = 10;
		TimeUnit unit = TimeUnit.SECONDS;
		driver.manage().timeouts().implicitlyWait(time, unit);
		driver.manage().timeouts().pageLoadTimeout(time, unit);
		robot.mouseMove(200, 50);

		return this;
	}

	public String getHeading() {
		return modalWindowHeading.getText();
	}

}
