import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Practice1 {

	public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("WebDriver.Driver","C:\\Users\\SONY\\Downloads\\ChromeDriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("file:///C:/Users/SONY/Desktop/Table.html");
	Thread.sleep(2000);
	List<WebElement> row=driver.findElements(By.xpath("/html/body/table/tbody/tr"));
	int r=row.size();
	System.out.println(r);
	List<WebElement> coloumn=driver.findElements(By.xpath("/html/body/table/tbody/tr/th"));
	int c=coloumn.size();
	System.out.println(c);
	List<WebElement> data=driver.findElements(By.xpath("/html/body/table/tbody/tr/td"));
	int d=data.size();
	System.out.println(d);
	for(int i=1;i<=1;i++)
	{
		for(int j=1;j<=c;j++)
		{
			System.out.println(driver.findElement(By.xpath("/html/body/table/tbody/tr["+i+"]/th["+j+"]")).getText());
		}
	}
	for(int i=2;i<=r;i++)
	{
		for(int j=1;j<=c;j++)
		{
			System.out.println(driver.findElement(By.xpath("/html/body/table/tbody/tr["+i+"]/td["+j+"]")).getText());
		}
	}
	
			
			
	}
	
	
	
	
	}


