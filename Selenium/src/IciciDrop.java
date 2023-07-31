import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class IciciDrop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.Driver","C:\\Users\\SONY\\Downloads\\ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.icicibank.com/");
		Thread.sleep(2000);
	WebElement accounts=driver.findElement(By.xpath("//span[normalize-space()='Accounts']"));
	WebElement deposits=driver.findElement(By.xpath("//label[contains(text(),'Ways')]"));
	Actions act=new Actions(driver);
	Thread.sleep(3000);
	act.moveToElement(accounts).moveToElement(deposits).click().perform();
		
		
		
		
		
		
}
}
