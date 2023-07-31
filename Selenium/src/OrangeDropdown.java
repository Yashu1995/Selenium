import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OrangeDropdown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.Driver","C:\\Users\\SONY\\Downloads\\ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.orangehrm.com/en/contact-sales/");
		Thread.sleep(2000);
		Select s=new Select(driver.findElement(By.name("Country")));
		s.selectByValue("India");
		Thread.sleep(2000);
		Select sn=new Select(driver.findElement(By.name("NoOfEmployees")));
		sn.selectByIndex(3);
		Thread.sleep(2000);
	}
}
