package apachePoiExcel;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {

	public static void main(String[] args) throws Throwable {

		FileInputStream fis;
		XSSFWorkbook wb;
		XSSFSheet sheet;

		File src = new File("E:\\Worksheets\\Testdata.xlsx");
		fis = new FileInputStream(src);
		wb = new XSSFWorkbook(fis);
		sheet = wb.getSheetAt(0);

		int lastrownum = sheet.getLastRowNum();

		for (int i = 0; i < lastrownum; i++) {

			String data = sheet.getRow(i).getCell(0).getStringCellValue();

			System.out.println(data);

			wb.close();

		}

	}

}
