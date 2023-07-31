import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingUploadFiles {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("Web Driver.Driver","C:\\\\Users\\\\SONY\\\\Downloads\\\\ChromeDRiver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/SONY/Desktop/UploadFile.html");
		Thread.sleep(2000);
	Actions a=new Actions(driver);
	a.click(driver.findElement(By.id("myFile"))).build().perform();
	
	}

}
