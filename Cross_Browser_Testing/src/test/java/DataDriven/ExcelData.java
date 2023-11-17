package DataDriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ExcelData {
	@Test
	public static Object[][] exceldata(String sheetname) throws EncryptedDocumentException, IOException {
		String filepath="./src/test/resources/Files/Data_Login.xlsx";
		FileInputStream Fs = new FileInputStream(filepath);
		Workbook wb = WorkbookFactory.create(Fs);
		Sheet sheet = wb.getSheet(sheetname);
		int row = sheet.getPhysicalNumberOfRows();
		int cell = sheet.getRow(0).getPhysicalNumberOfCells();
		Object[][] s = new Object[row - 1][cell];
		for (int i = 1; i < row; i++) {
			for (int j = 0; j < cell; j++) {
				s[i - 1][j] = sheet.getRow(i).getCell(j).toString();
			}

		}
		return s;
	}
}
