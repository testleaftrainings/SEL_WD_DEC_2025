package week5.day3;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadValueFromExcel {
	
	//Integration Step 1 : converting to  String[][]
	public static String[][] getValue() throws IOException  {

		// Step 1 : Setting up the excel file & path
		
		XSSFWorkbook wb = new XSSFWorkbook("./ReadExcel/CreateLead.xlsx");

		// Step 2: Get the sheet from the wb(Sheet)
		XSSFSheet sheet = wb.getSheetAt(0);

		// Step 3: Get the row value
		XSSFRow row = sheet.getRow(0);

		// getLastRowNum(); - Excludes the header
		int rowCount = sheet.getLastRowNum();
		System.out.println("Excluding the header " + rowCount);

		// getPhysicalNumberOfRows(); - Includes the header
		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		System.out.println("Includes the header " + physicalNumberOfRows);

		// count of the cell value / column
		short lastCellNum = sheet.getRow(1).getLastCellNum();
		System.out.println("LastCellNum " + lastCellNum);

		// count the cell value along with Header
		int physicalNumberOfCells = sheet.getRow(1).getPhysicalNumberOfCells();
		System.out.println("physicalNumberOfCells " + physicalNumberOfCells);

		// Step 4: get into the column using row
		XSSFCell cell = row.getCell(1);

		//Integration Step 2 :Return
		String[][] data= new String[rowCount][lastCellNum];
		
		// How to read entier cell value
		String stringCellValue = cell.getStringCellValue();
		System.out.println("stringCellValue " + stringCellValue);

		// print all the values from the sheet
		for (int i = 1; i <= rowCount; i++) {

			// cell value starts from 0.
			for (int j = 0; j < lastCellNum; j++) {

				String stringCellValue2 = sheet.getRow(i).getCell(j).getStringCellValue();
				System.out.println(stringCellValue2);
				
				//Integration Step 4: 
				data[i-1][j]=stringCellValue2;

			}

		}wb.close();
		//Integration Step 2 :Return
		return data;

	}

}
