package DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;

import org.apache.commons.collections4.map.HashedMap;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {
	
	
	
	public static void main(String[] args) throws IOException {
		
		File path = new File("C:\\Users\\User\\Desktop\\ReadDataTest.xlsx");
		try {
			FileInputStream fi= new FileInputStream(path);
			XSSFWorkbook wb= new XSSFWorkbook(fi);
			  XSSFSheet sheet= wb.getSheet("sheet1");
			  int rowCount=sheet.getLastRowNum();
			
			  Map<Object, Object> hm= new HashedMap<Object, Object>();
			  for(int i=0;i<rowCount;i++) {
				  
				  String key= sheet.getRow(i).getCell(0).getStringCellValue();
				  String value= sheet.getRow(i).getCell(3).getStringCellValue();
				  hm.put(key, value);
			  }
			  
			  System.out.println(hm.entrySet());
			 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
	
      
	}

}
