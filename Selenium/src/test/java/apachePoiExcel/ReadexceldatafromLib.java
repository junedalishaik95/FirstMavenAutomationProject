package apachePoiExcel;

import lib.Exceldataconfig;

public class ReadexceldatafromLib {

	public static void main(String[] args) {

		Exceldataconfig excel = new Exceldataconfig("E:\\Worksheets\\Testdata.xlsx");

		System.out.println(excel.getdata(0, 0, 0));
		
		
		

	}

}
