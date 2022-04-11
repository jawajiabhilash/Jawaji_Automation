package ReadJsonFromURL;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel {
	String filePath;
	Workbook wb;
	Sheet sh;

	public ReadExcel() {
		filePath = "C:\\Users\\User\\eclipse-workspace\\Demo\\TestData\\DD1.xlsx";
	}

	public HashMap<String, String> getDataIntoMap(int rowNum) throws EncryptedDocumentException, IOException {
		// Get the file
		File testDatafile = new File(filePath);
		// Create workbook from file
		wb = WorkbookFactory.create(testDatafile);
		// get the name from sheet
		sh = wb.getSheet("Sheet1");
		// Read the data from sheet
		// sh.getRow(0).getCell(1).toString();-->Password
		HashMap<String, String> hm = new HashMap<String, String>();

		for (int i = 0; i < sh.getRow(0).getLastCellNum(); i++) {
			// Convert cell data into String
			sh.getRow(rowNum).getCell(i).setCellType(CellType.STRING);
			hm.put(sh.getRow(0).getCell(i).toString(), sh.getRow(rowNum).getCell(i).toString());
		}
		return hm;
	}

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		ReadExcel re = new ReadExcel();
		System.out.println(re.getDataIntoMap(0));
		System.out.println("Total rows are: " + re.getRowCount());
		System.out.println("Total columns are: " + re.getColumnCount());
	}

	public int getRowCount() {
		return sh.getLastRowNum();
	}

	public int getColumnCount() {
		return sh.getRow(0).getLastCellNum();
	}
}
