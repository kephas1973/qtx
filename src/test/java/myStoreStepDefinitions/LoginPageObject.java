package myStoreStepDefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPageObject extends PageObjectSuperClass {
	
	@FindBy(id="email")
	private WebElement EmailInput;
	
	@FindBy(id="passwd")
	private WebElement PasswordInput;
	
	@FindBy(id="SubmitLogin")
	private WebElement signInButton;
	
	@FindBy(css=".account")
	private WebElement customerName;
	
	@FindBy(css=".myaccount-link-list li")
	private WebElement accountLinkList;
	
	@FindBy(css=".menu-content li:nth-child(1) a")
	private WebElement womenCatagoryButton;
	
	@FindBy(css=".lnk_wishlist a")
	private WebElement MyWishListButton;

	public LoginPageObject(WebDriver driverInstance) {
		super(driverInstance);
	}

	public LoginPageObject goToPage() {
		navigate("?controller=authentication&back=my-account");
		return this;
	}

	public LoginPageObject enterLoginInfo(String Email, String Password) {
		EmailInput.sendKeys(Email);
		PasswordInput.sendKeys(Password);
		return this;
	}

	public LoginPageObject clickSignInButton() {
		signInButton.click();
		return this;
	}

	public String getSignedInText() {
		return customerName.getText();
	}

	public MyAddressesPageObject clickMyAddressButton() {
		getMyAccountLink("My addresses").click();
		return new MyAddressesPageObject(driver);
	}
	
	private WebElement getMyAccountLink(String linkName) {
		return accountLinkList.findElement(By.xpath("//*[contains(text(),'" + linkName + "')]/ancestor::a"));
	}

	public CategoryWomanPage clickWomenCatagory() {
		womenCatagoryButton.click();
		return new CategoryWomanPage(driver);
	}

	public WishListPage GotoMyWishList() {
		MyWishListButton.click();
		return new WishListPage(driver);
	}

	public OrderHistoryAndDetailPage clickOrderHistoryAndDetails() {
		getMyAccountLink("Order history and details").click();
		return new OrderHistoryAndDetailPage(driver);
	}
	
	@FindBy(css=".header_user_info")
	private List<WebElement> navHeaderUserInfo;
	
	@FindBy(css=".header_user_info")
	private WebElement signoutButton;
	
	@FindBy(css=".page-heading + div p")
	private WebElement errormsg1;
	
	@FindBy(css=".page-heading + div ol li")
	private WebElement errormsg2;

	public LoginPageObject ifLoggedinThenLogout() {
		if(navHeaderUserInfo.size() == 2) {
			signoutButton.click();
		}
		return this;
	}

	public String getAlertText() {
		return errormsg1.getText() + " " + errormsg2.getText();
	}

}
