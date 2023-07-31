import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectorsHub {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.driver","C:\\Users\\SONY\\Downloads\\ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		/*driver.findElement(By.id("userId")).sendKeys("Yashwanth");
		driver.findElement(By.id("pass")).sendKeys("Yashwanth");
		driver.findElement(By.name("company")).sendKeys("WIPRo");
		driver.findElement(By.name("mobile number")).sendKeys("12345678");
		driver.findElement(By.id("inp_val")).sendKeys("Yashwanth");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[normalize-space()='Can you enter name here through automation']//*[name()='svg']")).click();
		driver.findElement(By.xpath("//input[@placeholder='First Enter name']")).sendKeys("Yashwanth");
		driver.findElement(By.xpath("//button[normalize-space()='Checkout here']")).click();
		Select select=new Select(driver.findElement(By.id("cars")));
				select.selectByIndex(2);*/
				driver.findElement(By.xpath("//*[@id=\"kils\"]")).sendKeys("Yashwanth");
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
