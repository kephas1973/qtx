package hw03062020fri;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.FindBy;

public class SliderPage extends SuperPageObject {
	public SliderPage(WebDriver driver, String baseUrl) {
		
		super(driver, baseUrl);
	}

	//@FindBy(id="range")
	//WebElement sliderFinalValue;
	//@FindBy(className="sliderContainer")
	//WebElement sliderWidget;

	//WebElement sliderFinalValue = driver.findElement(By.xpath("//span[@id='range']"));
	//WebElement sliderFinalValue = driver.findElement(By.xpath("//*[@id=\"range\"]"));
	
	//WebElement sliderWidget = driver.findElement(By.xpath("//input[@type='range' and @min='0.0']"));
	WebElement sliderWidget = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/input"));
	WebElement sliderFinalValue = driver.findElement(By.xpath("//*[@id=\"range\"]"));
	
	public SliderPage navigate() {
		
		super.navigate("/horizontal_slider");

		//return null;
		return this;
	}

	public String GetSliderMaxValue() {
		//return null;
		System.out.println(sliderFinalValue.getText());
		
		return sliderFinalValue.getText();
	}

	public SliderPage moveSliderToMaxValue() {
		
        Actions move = new Actions(driver);
        Action action = (Action) move.dragAndDropBy(sliderWidget, 5, 0).build();
        action.perform();
        
		System.out.println(sliderFinalValue.getText());
        
		return this;
		
		//return null;
	}

}
