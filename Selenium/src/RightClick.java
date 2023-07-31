import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Web Driver.Driver","C:\\\\Users\\\\SONY\\\\Downloads\\\\ChromeDRiver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		Thread.sleep(2000);
		Actions a=new Actions(driver);
		a.contextClick(driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"))).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/ul/li[5]/span")).click();
		Thread.sleep(2000);
driver.switchTo().alert().accept();	

	}

}
