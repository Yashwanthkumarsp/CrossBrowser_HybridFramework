package DataDriven;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import POM_Package.Element_Address;

public class Signup extends Genric_class {
	@Test(dataProvider = "Yash")
	public void normal(String Name, String Email) throws InterruptedException {
		Element_Address E=new Element_Address(driver);
		E.signuplink();
		E.NameField(Name);
		E.EmailField(Email);
		E.signupbutton();
	}

	@DataProvider(name = "Yash")
	public Object[][] fetchingdata() throws EncryptedDocumentException, IOException {
		return ExcelData.exceldata("Data_Signup");
	}

}
