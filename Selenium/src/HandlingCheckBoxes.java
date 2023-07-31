import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCheckBoxes {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.Driver","C:\\Users\\SONY\\Downloads\\ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("file:///C:/Users/SONY/Desktop/Checkbox.html");
		Thread.sleep(2000);
		driver.findElement(By.id("vehicle1")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("vehicle2")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("vehicle3")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("vehicle1")).click();
		driver.findElement(By.id("vehicle2")).click();
	}

}
