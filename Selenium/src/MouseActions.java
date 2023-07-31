import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.Driver", "C:\\Users\\SONY\\Downloads\\ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement source=driver.findElement(By.xpath("//*[@id=\"box1\"]"));
		WebElement destination=driver.findElement(By.xpath("//*[@id=\"box5\"]"));
Actions a= new Actions(driver);
a.clickAndHold(source).moveToElement(destination).build().perform();
	}

}
