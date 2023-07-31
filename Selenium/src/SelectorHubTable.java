import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectorHubTable
{
	public static void main(String[] args) throws IOException
	{
		System.setProperty("WebDriver.Driver","C:\\Users\\SONY\\Downloads\\ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
		/*List<WebElement> row=driver.findElements(By.xpath("//*[@id=\"resultTable\"]/tbody/tr"));
		int r=row.size();
		System.out.println(r);
		List<WebElement> coloumn=driver.findElements(By.xpath("//*[@id=\"resultTable\"]/thead/tr/th"));
		int c=coloumn.size();
		System.out.println(c);
		List<WebElement> data=driver.findElements(By.xpath("//*[@id=\"resultTable\"]/tbody/tr/td"));
		int d=data.size();
		System.out.println(d);
		for(int i=1;i<=1;i++)
		{
			for(int j=1;j<=c;j++)
			{
				System.out.println(driver.findElement(By.xpath("/html/body/div[1]/main/div/div[1]/section[2]/div/div[1]/div/div[2]/div/div/table/thead/tr["+i+"]/th["+j+"]")).getText());
			}
	c	}
		//thead/tr/th[4]
		//tbody/tr[1]/td[2]
		//*[@id="resultTable"]/thead/tr/th[2]
			for(int i=2;i<=r;i++)
			{
				for(int j=1;j<=c;j++)
				{
					System.out.println(driver.findElement(By.xpath("/html/body/div[1]/main/div/div[1]/section[2]/div/div[1]/div/div[2]/div/div/table/tbody/tr["+i+"]/td["+j+"]")).getText());
				}
				
		}*/
		Select select=new Select(driver.findElement(By.xpath("//*[@id=\"tablepress-1_length\"]/label/select")));
		select.selectByIndex(3);
		List<WebElement> row=driver.findElements(By.xpath("//*[@id=\"tablepress-1\"]/tbody/tr"));
		int r=row.size();
		System.out.println(r);
		List<WebElement> coloumn=driver.findElements(By.xpath("//*[@id=\"tablepress-1\"]/thead/tr/th"));
		int c=coloumn.size();
		System.out.println(c);
		List<WebElement> data=driver.findElements(By.xpath("//*[@id=\"tablepress-1\"]/tbody/tr/td"));
		int d=data.size();
		System.out.println(d);
	for(int i=1;i<=1;i++)
	{
		for(int j=1;j<=c;j++)
		{
			System.out.println(driver.findElement(By.xpath("/html/body/div[1]/main/div/div[1]/section[3]/div/div/div/div[3]/div/div/div/table/thead/tr["+i+"]/th["+j+"]")).getText());
		}
	}
	
for(int i=2;i<=r;i++)
{
	for(int j=1;j<=c;j++)
	{
		System.out.println(driver.findElement(By.xpath("/html/body/div[1]/main/div/div[1]/section[3]/div/div/div/div[3]/div/div/div/table/tbody/tr["+i+"]/td["+j+"]")).getText());
	}
}

	}
}