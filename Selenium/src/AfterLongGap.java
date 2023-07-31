import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AfterLongGap {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("WebDriver.Driver","C:\\Users\\SONY\\Downloads\\ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		/*System.setProperty("WebDriver.Driver","C:\\Users\\SONY\\Downloads\\ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String name=driver.getCurrentUrl();
System.out.println(name);
String name1=driver.getTitle();
System.out.println(name1);
Thread.sleep(2000);

driver.findElement(By.name("username")).sendKeys("Admin");
driver.findElement(By.name("password")).sendKeys("admin123");
driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/div/div/input")).sendKeys("Performance");
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/p")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a")).click();
FileInputStream fis=new FileInputStream("C:\\Users\\SONY\\Desktop\\Practice.xlsx");
XSSFWorkbook fw=new XSSFWorkbook(fis);
XSSFSheet fs=fw.getSheet("Sheet1");

int row=fs.getLastRowNum();
int coloumn=fs.getRow(0).getLastCellNum();
for(int i=1;i<=row;i++)
{
	XSSFRow fr=fs.getRow(i);
	String Name=fr.getCell(0).getStringCellValue();
	int password=(int) fr.getCell(1).getNumericCellValue();
	driver.findElement(By.id("email")).sendKeys(Name);
	driver.findElement(By.id("pass")).sendKeys(String.valueOf(password));
	driver.get("https://facebook.com");
TakesScreenshot tss=(TakesScreenshot)driver;
File source=tss.getScreenshotAs(OutputType.FILE);
File destination=new File("C:\\Users\\SONY\\Desktop\\demo.png");
FileUtils.copyFile(source, destination);*/
	
		
		
		
		
}












	}


