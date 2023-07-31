import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingPageUpDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Web Driver.Driver","C:\\\\Users\\\\SONY\\\\Downloads\\\\ChromeDRiver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://amazon.com");
		Thread.sleep(2000);
		Actions a=new Actions(driver);
		a.sendKeys(Keys.UP,Keys.DOWN).build().perform();

	}

}
