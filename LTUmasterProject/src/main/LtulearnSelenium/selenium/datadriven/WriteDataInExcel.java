package selenium.datadriven;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.Test;

import libraryGeneric.Excel;

public class WriteDataInExcel {

	@Test
	public void login() throws EncryptedDocumentException, IOException
	{
		//WebDriver driver = BrowserFactory.startBrowser("chrome");
		/*File file =    new File("./testdata/Write Data.xlsx");
		FileInputStream fis = new FileInputStream(file);
		//Workbook wb = new XSSFWorkbook(fis);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet st = wb.getSheet("Sheet1");
		Row r = st.createRow(0);
		
		Cell c = r.createCell(0);
		
		c.setCellValue("Admin");
		
		FileOutputStream fileout = new FileOutputStream("./testdata/Write Data.xlsx");
		
		wb.write(fileout);*/
		
		Excel.writeDataIntoExcel("./testdata/Write Data.xlsx", "Sheet1", 1, 0,"Adminsanaz" );
		Excel.writeDataIntoExcel("./testdata/Write Data.xlsx", "Sheet1", 0, 1,"admin1ana23" );
		
		String data1 = Excel.readData("./testdata/Write Data.xlsx", "Sheet1", 1, 0);
		
		String data2 = Excel.readData("./testdata/Write Data.xlsx", "Sheet1", 0, 1);
		
		Reporter.log("Data in Excel:- " +data1, true);
		
		Reporter.log("Data in Excel:- " +data2, true);
		
		//Previously entered Data is getting removed - Need to resolve
	}

	
}
