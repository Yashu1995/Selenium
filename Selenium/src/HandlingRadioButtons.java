import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingRadioButtons {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.Driver","C:\\Users\\SONY\\Downloads\\ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/SONY/Desktop/Java%20Programs/RadioButton.html");
driver.findElement(By.id("html")).click();
Thread.sleep(2000);
driver.findElement(By.id("css")).click();
Thread.sleep(2000);
driver.findElement(By.id("javascript")).click();
Thread.sleep(2000);
driver.findElement(By.id("age1")).click();
Thread.sleep(2000);
driver.findElement(By.id("age2")).click();
Thread.sleep(2000);
driver.findElement(By.id("age3")).click();
Thread.sleep(2000);
	}

}
