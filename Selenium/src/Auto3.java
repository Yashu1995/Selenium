import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Auto3 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("WebDriver.Driver","C:\\Users\\SONY\\Downloads\\ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/SONY/Desktop/UploadFile.html");
		Thread.sleep(1000);
		Actions a=new Actions(driver);
		a.click(driver.findElement(By.id("myFile"))).build().perform();
		Thread.sleep(2000);
		Runtime.getRuntime().exec("C:\\Users\\SONY\\Desktop\\Demotest.exe");
	
	}

}
