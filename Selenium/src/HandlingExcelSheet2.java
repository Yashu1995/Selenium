import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class HandlingExcelSheet2 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\SONY\\Documents\\HandlingExcel.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet fs=wb.getSheet("Sheet2");
		int row=fs.getLastRowNum();
		System.out.println(row);
		int coloumn=fs.getRow(0).getLastCellNum();
		System.out.println(coloumn);
		for(int i=0;i<=row;i++)
		{
			XSSFRow fr=fs.getRow(i);
			for(int j=0;j<coloumn;j++)
			{
				String value=fr.getCell(j).toString();
				System.out.println(value);
			}
			
		}
		

	}

}
