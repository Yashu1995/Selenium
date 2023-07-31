import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class HandlingExcel1 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\SONY\\Desktop\\Test Cases\\Test Cases.xlsx");
		XSSFWorkbook w=new XSSFWorkbook(fis);
		XSSFSheet s=w.getSheet("Sheet1");
		int row=s.getLastRowNum();
		System.out.println(row);
		int coloumn =s.getRow(0).getLastCellNum();
		System.out.println(coloumn);
		for(int i=0;i<=row;i++)
		{
			XSSFRow r=s.getRow(i);
			for(int j=0;j<coloumn;j++)
			{
				String value=r.getCell(j).toString();
				System.out.println(value);
			}
				
		}
		
		
	}
	
	

}

