import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingExcelLogin {

	public static void main(String[] args) throws IOException {
		System.setProperty("WebDriver.Chrome.Driver", "C:\\Users\\SONY\\Downloads\\ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		FileInputStream fis=new FileInputStream("C:\\Users\\SONY\\Desktop\\Loginexcel.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet fs=wb.getSheet("Sheet1");
		int row=fs.getLastRowNum();
		System.out.println(row);
		int coloumn=fs.getRow(0).getLastCellNum();
		System.out.println(coloumn);
		for(int i=1;i<=row;i++)
		{
		XSSFRow fr=fs.getRow(i);
		int Userid =(int) fr.getCell(0).getNumericCellValue();
		String password=fr.getCell(1).getStringCellValue();
		driver.findElement(By.id("email")).sendKeys(String.valueOf(Userid));
		driver.findElement(By.id("pass")).sendKeys(password);
		driver.get("https://facebook.com");
		
	
		}

	}

}
