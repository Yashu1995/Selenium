import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsMethods {

	public static void main(String[] args) {
		System.setProperty("WebDriver.driver", "C:\\Users\\SONY\\Downloads\\ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
WebElement ele=driver.findElement(By.name("q"));
ele.sendKeys("Today's Weather");
ele.clear();
ele.sendKeys("WebElement");
driver.close();






	}

}
