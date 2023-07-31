import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTable {

	public static void main(String[] args) {
		System.setProperty("Web Driver.Driver","C:\\\\Users\\\\SONY\\\\Downloads\\\\ChromeDRiver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/SONY/Desktop/Table.html");
		List<WebElement> r=driver.findElements(By.xpath("/html/body/table/tbody/tr"));
int rowcount=r.size();
System.out.println(rowcount);
List<WebElement> c=driver.findElements(By.xpath("/html/body/table/tbody/tr/th"));
int coloumncount=c.size();
System.out.println(coloumncount);
List<WebElement> d=driver.findElements(By.xpath("/html/body/table/tbody/tr/td"));
int data=d.size();
System.out.println(data);
for(int i=1;i<=1;i++)
{
	for(int j=1;j<=coloumncount;j++)
	{
	System.out.println(driver.findElement(By.xpath("/html/body/table/tbody/tr["+i+"]/th["+j+"]")).getText());
		
		
	}
}
for(int i=2;i<=rowcount;i++)
{
	for(int j=1;j<=coloumncount;j++)
	{
	System.out.println(driver.findElement(By.xpath("/html/body/table/tbody/tr["+i+"]/td["+j+"]")).getText());
		
		
	}
}


	}

}
