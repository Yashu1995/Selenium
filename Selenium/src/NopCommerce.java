import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class NopCommerce {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.driver","C:\\Users\\SONY\\Downloads\\ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		/*Select options=new Select(driver.findElement(By.id("customerCurrency")));
		options.selectByIndex(1);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[normalize-space()='Log in']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='wishlist-label']")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='cart-label']")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("Books");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();
		Thread.sleep(1000);
		driver.navigate().back();*/
		WebElement computer=driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Computers']"));
		WebElement software=driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[normalize-space()='Software']"));
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		act.moveToElement(computer).moveToElement(software).click().perform();
		//Select product=new Select(driver.findElement(By.id("products-orderby")));
		//product.selectByIndex(3);
		//Thread.sleep(1000);
		/*driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[1]/div/div[2]/div[3]/div[2]/button[1]")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[1]/div/div[2]/div[3]/div[2]/button[2]")).click();
		Thread.sleep(1000);
		driver.navigate().refresh();
		driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[1]/div/div[2]/div[3]/div[2]/button[3]")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		//driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div/div[5]/div[2]/div[1]/div[1]/a")).click();*/
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
