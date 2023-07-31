//import org.openqa.selenium.By;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHtml {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.Driver","C:\\Users\\SONY\\Downloads\\ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/SONY/Desktop/Dropdown.html");
		Thread.sleep(1000);
		Select s=new Select(driver.findElement(By.name("cars")));
		s.selectByIndex(1);
		Thread.sleep(2000);
		s.selectByVisibleText("Audi");
		Thread.sleep(3000);
		s.selectByValue("opel");
Thread.sleep(2000);

	}

}
