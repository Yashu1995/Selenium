import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingMouseEvents {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.Driver","C:\\Users\\SONY\\Downloads\\ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Dynamic.html");
		Thread.sleep(2000);
		/*Actions a=new Actions(driver);
		a.click(driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[6]/a"))).build().perform();
		Thread.sleep(2000);
		a.click(driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[6]/ul/li[1]/a"))).build().perform();
		Thread.sleep(2000);
		a.click(driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[6]/ul/li[1]/ul/li[2]/a"))).build().perform();*/
		WebElement e1=driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[6]/a"));
		
		WebElement e2=driver.findElement(By.xpath("//*[@id=\\\"header\\\"]/nav/div/div[2]/ul/li[6]/ul/li[1]/a"));
		
		WebElement e3=driver.findElement(By.xpath("//*[@id=\\\"header\\\"]/nav/div/div[2]/ul/li[6]/ul/li[1]/ul/li[2]/a"));
		
		Actions a1=new Actions(driver);
		
		a1.moveToElement(e1).moveToElement(e2).moveToElement(e3).click().build().perform();
		
		
		
	}

}
