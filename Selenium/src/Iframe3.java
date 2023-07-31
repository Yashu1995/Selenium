import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Iframe3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Web Driver.Driver","C:\\\\Users\\\\SONY\\\\Downloads\\\\ChromeDRiver.exe");
WebDriver driver=new ChromeDriver();
driver.get("file:///C:/Users/SONY/Desktop/iframe2.html");
driver.switchTo().frame(0);
driver.findElement(By.id("html")).click();
Thread.sleep(3000);
driver.switchTo().parentFrame();
driver.switchTo().frame(1);
Select s=new Select(driver.findElement(By.id("cars")));
s.selectByIndex(1);
Thread.sleep(2000);
driver.switchTo().parentFrame();
driver.switchTo().frame(2);
driver.findElement(By.id("vehicle1")).click();


	}
}
