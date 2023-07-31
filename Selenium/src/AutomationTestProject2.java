import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutomationTestProject2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.driver","C:\\Users\\SONY\\Downloads\\ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
/*driver.findElement(By.xpath("//*[@id=\"HTML9\"]/div[1]/button[1]")).click();
Thread.sleep(2000);
driver.switchTo().alert().accept();
driver.findElement(By.xpath("//*[@id=\"HTML9\"]/div[1]/button[2]")).click();
Thread.sleep(2000);
driver.switchTo().alert().accept();
driver.findElement(By.xpath("//*[@id=\"HTML9\"]/div[1]/button[3]")).click();
Thread.sleep(2000);
driver.switchTo().alert().sendKeys("Yashwanth");
Thread.sleep(2000);
driver.switchTo().alert().accept();
driver.findElement(By.id("field1")).clear();
driver.findElement(By.id("field1")).sendKeys("Hello");
driver.findElement(By.id("field2")).sendKeys("Yashwanth");
Thread.sleep(2000);*/
Actions act=new Actions(driver);
WebElement copyText=driver.findElement(By.xpath("//*[@id=\"HTML10\"]/div[1]/button"));
act.doubleClick(copyText).perform();
		WebElement drag=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));	
		WebElement drop=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));	
		Actions act1=new Actions(driver);
		act1.dragAndDrop(drag, drop).build().perform();






















	}

}
