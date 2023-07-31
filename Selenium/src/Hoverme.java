import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hoverme {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("WebDriver.Driver", "C:\\Users\\SONY\\Downloads\\ChromeDriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://swisnl.github.io/jQuery-contextMenu/demo/trigger-hover.html");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	Actions a=new Actions(driver);
	a.click(driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"))).build().perform();
	Thread.sleep(2000);
	a.click(driver.findElement(By.xpath("/html/body/ul/li[7]/span"))).build().perform();
	Thread.sleep(2000);
	driver.switchTo().alert().accept();
	Thread.sleep(2000);
	driver.quit();
	
		}

}
