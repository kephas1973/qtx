package hw03062020fri;

//package ui.control.extensions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckboxGroup {

	private WebElement mappedElement;

	public CheckboxGroup(WebElement mappedElement) {
		this.mappedElement = mappedElement;
	}

	public Checkbox getCheckbox(int index) {
		List<WebElement> foundElements = mappedElement.findElements(By.tagName("input"));
		
		if(foundElements.size() < index) {
			throw new RuntimeException(new Exception("No checkbox with index " + index + " exists in the checkbox group"));
		}
		
		WebElement foundElement = foundElements.get(index);
		
		return new Checkbox(foundElement);
	}
}
