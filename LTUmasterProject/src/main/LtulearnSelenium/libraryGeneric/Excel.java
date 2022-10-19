package libraryGeneric;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;
public class Excel 


{
	/* Function Name : Read Data From Excel
     * Description   : 
     * Parameters    :  filepath, sheetName, rowNumber, cellNumber
     * Author & Date : LTU & 13-June-2021
     * Modified Date :*/

    public static String readData(String filepath, String sheetName, int rowNumber, int cellNumber) {

        File file = new File(filepath);
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        //Workbook wb = new XSSFWorkbook(fis);
        Workbook wb = null;
        try {
            wb = WorkbookFactory.create(fis);
        } catch (EncryptedDocumentException | IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        Sheet st = wb.getSheet(sheetName);
        Row r = st.getRow(rowNumber);
        Cell c = r.getCell(cellNumber);
        String data = c.getStringCellValue();

        return data;
    }


    /* Function Name : Write Data into Excel
     * Description   : 
     * Parameters    :  filepath, sheetName, rowNumber, cellNumber
     * Author & Date : LTU & 15-June-2021
     * Modified Date :*/

    public static void writeDataIntoExcel(String filepath, String sheetName, int rowNumber, int cellNumber, String data) {

        File file = new File(filepath);
        FileInputStream fis = null;
        try {
            fis = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        //Workbook wb = new XSSFWorkbook(fis);
        Workbook wb = null;
        try {
            wb = WorkbookFactory.create(fis);
        } catch (EncryptedDocumentException | IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        Sheet st = wb.getSheet(sheetName);
        Row r = st.createRow(rowNumber);

        Cell c = r.createCell(cellNumber);

        c.setCellValue(data);

        FileOutputStream fileout = null;
        try {
            fileout = new FileOutputStream(filepath);
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        try {
            wb.write(fileout);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    
    /* Function Name : getExcelRowCount
     * Description   : 
     * Parameters    :  filepath, sheetName, rowNumber, cellNumber
     * Author & Date : LTU & 15-June-2021
     * Modified Date :*/

	public static int getExcelRowCount(String filePath, String sheetName)
	{
		int rowNo = 0;
		try
		{
			FileInputStream fileInput = new FileInputStream(filePath);
			Workbook wb = WorkbookFactory.create(fileInput);
			Sheet st = wb.getSheet(sheetName);
			rowNo = st.getLastRowNum();
			
		}
		catch(Exception e)
		{
			
		}
		return rowNo;
}
	
	 /* Function Name : getExcelCellCount
     * Description   : 
     * Parameters    :  filepath, sheetName, rowNumber, cellNumber
     * Author & Date : LTU & 15-June-2021
     * Modified Date :*/

	public static int getExcelCellCount(String filePath, String sheetName, int rowNo)
	{
		try
		{
			FileInputStream fileInput = new FileInputStream(filePath);
			Workbook wb = WorkbookFactory.create(fileInput);
			Sheet st = wb.getSheet(sheetName);
			Row r = st.getRow(rowNo);
			return r.getLastCellNum();
		}
		catch(Exception e)
		{
			return -1;
		}
}

	
	

		
}
	
	
	
	


