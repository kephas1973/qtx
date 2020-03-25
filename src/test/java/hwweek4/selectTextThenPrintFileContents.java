package hwweek4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class selectTextThenPrintFileContents extends PageObjectSuperClass {

	private Scanner input;
	private String fileContents;
	
	@FindBy(xpath="//*[@id=\"content\"]/div/a[1]")
	private WebElement textTxtSelector;
	
	public selectTextThenPrintFileContents(WebDriver driverInstance) {
		super(driverInstance);
	}

	public selectTextThenPrintFileContents goToPage() {
		navigate("/download");
		return this;
	}

	public selectTextThenPrintFileContents clickTextFileToDownload() {
		textTxtSelector.click();
		return this;
	}

	public selectTextThenPrintFileContents openTextFile() {
		try {
			input = new Scanner(new File("C:\\Users\\rpros\\Downloads\\text.txt"));
		}
		catch ( FileNotFoundException fileNotFoundException) {
			System.err.println("Error opening file.");
			System.exit(1);
		}
		return this;
	}

	public selectTextThenPrintFileContents readContents() {
		try {
			while (input.hasNext()) {
				fileContents = input.nextLine();
			}
		}
		catch (NoSuchElementException elementException) {
			System.err.println("File improperly formed.");
			input.close();
			System.exit(1);
		}
		catch (IllegalStateException stateException) {
			System.err.println("Error reading from file.");
			System.exit(1);
		}
		return this;
	}
	
	public selectTextThenPrintFileContents closeFile() {
		if ( input != null ) {
			input.close();
		}
		return this;
	}

	public selectTextThenPrintFileContents printContentsToScreen() {
		System.out.println(fileContents);
		return this;
	}

	public String returnContents() {
		return fileContents;
	}

}
