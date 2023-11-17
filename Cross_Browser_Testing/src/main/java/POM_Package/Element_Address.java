package POM_Package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Element_Address {
	// Declaration
	//Login
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
	
	//Contact Us
	@FindBy(xpath = "//a[@href='/contact_us']")
	private WebElement ContactUs;

	@FindBy(xpath = "//input[@data-qa='name']")
	private WebElement ContactUs_Name;

	@FindBy(xpath = "//input[@data-qa='email']")
	private WebElement ContactUs_Email;

	@FindBy(xpath = "//input[@data-qa='subject']")
	private WebElement ContactUs_Subject;

	@FindBy(xpath = "//textarea[@data-qa='message']")
	private WebElement ContactUs_Message;

	@FindBy(xpath = "//input[@name='upload_file']")
	private WebElement ContactUs_UploadFile;

	@FindBy(xpath = "//input[@data-qa='submit-button']")
	private WebElement ContactUs_SubmitButton;

	@FindBy(xpath = "//a[@class='btn btn-success']")
	private WebElement ContactUs_HomeButton;
	
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
	
	//Contact Us
	public void ContactUs() {
		ContactUs.click();
	}

	public void ContactUs_Name(String name) {
		ContactUs_Name.sendKeys(name);
	}

	public void ContactUs_Email(String email) {
		ContactUs_Email.sendKeys(email);
	}

	public void ContactUs_Subject(String subject) {
		ContactUs_Subject.sendKeys(subject);
	}

	public void ContactUs_Message(String message) {
		ContactUs_Message.sendKeys(message);
	}

	public void ContactUs_UploadFile(String filepath) {
		ContactUs_UploadFile.sendKeys(filepath);
	}

	public void ContactUs_SubmitButton() {
		ContactUs_SubmitButton.click();
	}

	public void ContactUs_HomeButton() {
		ContactUs_HomeButton.click();
	}
}
