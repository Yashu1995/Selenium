import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSheet {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\SONY\\Desktop\\Test Cases\\Para bank Test cases.xlsx");
		XSSFWorkbook fw=new XSSFWorkbook(fis);
		XSSFSheet fs=fw.getSheet("Sheet1");
		int row=fs.getLastRowNum();
		System.out.println(row);
		int coloumn=fs.getRow(0).getLastCellNum();
		System.out.println(coloumn);
		for(int i=0;i<row;i++)
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
