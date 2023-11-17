package DataDriven;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.Alert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import POM_Package.Element_Address;

public class Contact_Us  extends Genric_class {
	@Test(dataProvider = "Yash")
	public void logIn(String Con_Name, String Con_Email, String Con_Sub, String Con_Msg, String Con_FilePath) throws InterruptedException {
		Element_Address E = new Element_Address(driver);
		E.ContactUs();
		E.ContactUs_Name(Con_Name);
		E.ContactUs_Email(Con_Email);
		E.ContactUs_Subject(Con_Sub);
		E.ContactUs_Message(Con_Msg);
		E.ContactUs_UploadFile(Con_FilePath);
		E.ContactUs_SubmitButton();
		Alert al = driver.switchTo().alert();
		al.accept();
		E.ContactUs_HomeButton();
		
	}

	@DataProvider(name = "Yash")
	public Object[][] fetchingdata() throws EncryptedDocumentException, IOException {
		return ExcelData.exceldata("Data_ContactUs");
	}
}
