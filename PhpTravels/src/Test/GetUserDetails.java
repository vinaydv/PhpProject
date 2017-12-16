package Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GetUserDetails {
	
	public static String  getdata() throws IOException{
	
	File src = new File("Testdata.xlsx");
	FileInputStream fis = new FileInputStream(src);
	XSSFWorkbook wb = new XSSFWorkbook(fis);
	XSSFSheet sh = wb.getSheetAt(0);
	int Rownum = sh.getLastRowNum();
	
	for(int i=1; i<=Rownum; i++) {
		
		String Username= sh.getRow(i).getCell(0).getStringCellValue();
		String Password= sh.getRow(i).getCell(1).getStringCellValue();
		String userData = Username+','+Password;
		return userData;
}
	return null;
}
}
