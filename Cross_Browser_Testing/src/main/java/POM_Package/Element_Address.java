package POM_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Element_Address {
	// Declaration
	@FindBy(xpath = "//a[@href='/login']")
	private WebElement loginlink;

	@FindBy(xpath = "//input[@data-qa='login-email']")
	private WebElement EmailField;

	@FindBy(xpath = "//input[@data-qa='login-password']")
	private WebElement PasswordField;

	@FindBy(xpath = "//button[@data-qa='login-button']")
	private WebElement loginbutton;

	@FindBy(xpath = "//a[@href='/logout']")
	private WebElement logoutbutton;

	// Initialization
	public Element_Address(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// Utilization
	public void loginlink() {
		loginlink.click();
	}

	public void EmailField(String email) {
		EmailField.sendKeys(email);
	}

	public void PasswordField(String password) {
		PasswordField.sendKeys(password);
	}

	public void loginbutton() {
		loginbutton.click();
	}

	public void logoutbutton() {
		logoutbutton.click();
	}
}
