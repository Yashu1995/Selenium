import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TabOrder {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Web Driver.Driver","C:\\\\Users\\\\SONY\\\\Downloads\\\\ChromeDRiver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		Thread.sleep(2000);
		driver.findElement(By.name("email")).sendKeys("Yashwanth");
		Thread.sleep(2000);
		Actions a=new Actions(driver);
		a.sendKeys(Keys.TAB).build().perform();
		Thread.sleep(2000);
		a.sendKeys("12345");
		a.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		

	}

}
