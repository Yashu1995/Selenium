import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingExcel {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("WebDriver.Driver","C:\\Users\\SONY\\Downloads\\ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		FileInputStream fis=new FileInputStream("C:\\Users\\SONY\\Desktop\\Faceebook.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet fs=wb.getSheet("Sheet1");
		int row=fs.getLastRowNum();
		System.out.println(row);
		int coloumn =fs.getRow(0).getLastCellNum();
		System.out.println(coloumn);
		for(int i=1;i<=row;i++)
		{
			XSSFRow fr=fs.getRow(i);
			String Email=fr.getCell(0).getStringCellValue();
			int Password=(int) fr.getCell(1).getNumericCellValue();
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys(Email);
			Thread.sleep(5000);
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys(String.valueOf(Password));
			Thread.sleep(5000);
			driver.get("https://www.instagram.com/");
			Thread.sleep(5000);
			
		
		

	}

	}
}
