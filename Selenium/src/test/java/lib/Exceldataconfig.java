package lib;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exceldataconfig {

	FileInputStream fis;
	XSSFWorkbook wb;
	XSSFSheet sheet;

	public Exceldataconfig(String Excelpath) {

		try {
			File src = new File(Excelpath);
			fis = new FileInputStream(src);
			wb = new XSSFWorkbook(fis);

		} catch (Exception e) {

			e.getMessage();
		}

	}

	public String getdata(int sheetnumber, int row, int coloumn) {

		sheet = wb.getSheetAt(sheetnumber);

		String data = sheet.getRow(row).getCell(coloumn).getStringCellValue();

		return data;

	}

}
