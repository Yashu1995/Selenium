import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Practice2 {

	public static void main(String[] args) throws Exception {
		System.setProperty("WebDriver.Driver","C:\\Users\\SONY\\Downloads\\ChromeDriver.exe");
		
		


		WebDriver driver=new ChromeDriver();

		driver.get("https://www.icicibank.com/");
		driver.manage().window().maximize();
	//	driver.findElement(By.xpath("//*[@id=\"modal-close\"]/img")).click();
		
	Actions a=new Actions(driver);
	WebElement actions=driver.findElement(By.xpath("//span[normalize-space()='Accounts']"));
	a.moveToElement(actions).click().build().perform();
	Thread.sleep(2000);
	WebElement card=driver.findElement(By.xpath("//span[normalize-space()='Cards']"));
	a.moveToElement(card).click().build().perform();
	Thread.sleep(2000);
	WebElement loans=driver.findElement(By.xpath("//span[normalize-space()='Loans']"));
	a.moveToElement(loans).click().build().perform();
	Thread.sleep(2000);
	
	
	
	
	
	
	}
	
	
	
	
	
	
	

}
