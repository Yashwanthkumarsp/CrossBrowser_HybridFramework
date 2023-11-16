package POM_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Element_Address {
	//Declaration
	@FindBy(xpath = "//a[@href='/login']")
	private WebElement signuplink;

	@FindBy(xpath = "//input[@data-qa='signup-name']")
	private WebElement NameField;

	@FindBy(xpath = "//input[@data-qa='signup-email']")
	private WebElement EmailField;

	@FindBy(xpath = "//button[@data-qa='signup-button']")
	private WebElement signupbutton;

	//Initialization
	public Element_Address(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//Utilization
	public void signuplink() {
		signuplink.click();
	}

	public void NameField(String name) {
		NameField.sendKeys(name);
	}

	public void EmailField(String email) {
		EmailField.sendKeys(email);
	}

	public void signupbutton() {
		signupbutton.click();
	}

}
