import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseEventsDragndrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.Driver","C:\\Users\\SONY\\Downloads\\ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		Thread.sleep(2000);
WebElement capitals=driver.findElement(By.xpath("//*[@id=\"box3\"]"));
WebElement country=driver.findElement(By.xpath("//*[@id=\"box103\"]"));
Actions a=new Actions(driver);
//a.clickAndHold(capitals).moveToElement(country).release().build().perform();
a.dragAndDrop(capitals, country).build().perform();
	}

}

