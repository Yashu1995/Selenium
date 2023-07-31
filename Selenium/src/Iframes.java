import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframes {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("WebDriver.Driver", "C:\\Users\\SONY\\Downloads\\ChromeDRiver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/SONY/Desktop/iframe.html");
Thread.sleep(1000);
driver.switchTo().frame(0);
driver.findElement(By.id("css")).click();
Thread.sleep(3000);
driver.switchTo().parentFrame();
driver.switchTo().frame(1);
driver.findElement(By.xpath("/html/body/form/label[1]")).click();

	}

}
