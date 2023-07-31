import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.Chrome.Driver","C:\\Users\\SONY\\Downloads\\ChromeDriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	Thread.sleep(1000);
driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a")).click();
Thread.sleep(1000);
Actions act=new Actions(driver);
Thread.sleep(3000);
act.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).build().perform();
Thread.sleep(3000);
act.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).build().perform();
Thread.sleep(1000);
driver.navigate().refresh();
Thread.sleep(1000);
driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a")).click();
Thread.sleep(1000);
driver.findElement(By.name("firstname")).sendKeys("Yashwanth");
Thread.sleep(1000);
driver.findElement(By.name("lastname")).sendKeys("Kumar");
Thread.sleep(1000);
driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[2]/div/div[1]/input")).sendKeys("8374691200");
Thread.sleep(1000);
driver.findElement(By.id("password_step_input")).sendKeys("Yashwanth@09");
Select select=new Select(driver.findElement(By.id("day")));
select.selectByIndex(8);
Thread.sleep(1000);
Select select1=new Select(driver.findElement(By.id("month")));
select1.selectByVisibleText("Mar");
Thread.sleep(1000);
Select select2=new Select(driver.findElement(By.id("year")));
select2.selectByValue("1995");
Thread.sleep(1000);
driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[2]")).click();
Thread.sleep(1000);
driver.findElement(By.name("websubmit")).click();


















	}

}
