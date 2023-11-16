package DataDriven;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import POM_Package.Element_Address;

public class login extends Genric_class {
	@Test(dataProvider = "Yash")
	public void logIn(String Email, String Password) throws InterruptedException {
		Element_Address E = new Element_Address(driver);
		E.loginlink();
		E.EmailField(Email);
		E.PasswordField(Password);
		E.loginbutton();
		try {
			boolean displayed = driver.findElement(By.xpath("//i[@class='fa fa-user']/..")).isDisplayed();
			if (displayed) {
				E.logoutbutton();
			}
		} catch (Exception e) {
			System.out.println("Email:- " + Email + " or " + "Password:- " + Password + " is Wrong");
		}
	}

	@DataProvider(name = "Yash")
	public Object[][] fetchingdata() throws EncryptedDocumentException, IOException {
		return ExcelData.exceldata("Data_Login");
	}

}
