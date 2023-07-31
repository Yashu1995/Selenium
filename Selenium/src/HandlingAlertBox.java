import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlertBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.Driver","C:\\Users\\SONY\\Downloads\\ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/SONY/Desktop/Alertbox.html");
		Thread.sleep(1000);
		driver.findElement(By.xpath("/html/body/button")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		

	}

}
