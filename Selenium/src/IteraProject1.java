import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class IteraProject1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.driver","C:\\Users\\SONY\\Downloads\\ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize();
		Thread.sleep(1000);
driver.findElement(By.xpath("//*[@id=\"navbarColor01\"]/ul/li[1]/a")).click();
Thread.sleep(1000);
driver.navigate().back();
driver.findElement(By.xpath("//*[@id=\"navbarColor01\"]/ul/li[2]/a")).click();
Thread.sleep(1000);
driver.navigate().back();
driver.findElement(By.xpath("//*[@id=\"navbarColor01\"]/ul/li[3]/a")).click();
Thread.sleep(1000);
driver.navigate().refresh();
driver.findElement(By.xpath("//*[@id=\"navbarColor01\"]/ul/li[4]/a")).click();
Thread.sleep(1000);
driver.navigate().back();
driver.findElement(By.xpath("//*[@id=\"navbarColor01\"]/form/ul/li[1]/a")).click();
Thread.sleep(1000);
driver.navigate().back();
driver.findElement(By.xpath("//*[@id=\"navbarColor01\"]/form/ul/li[2]/a")).click();
Thread.sleep(1000);
driver.navigate().back();
driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Yashu");
Thread.sleep(1000);
driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();
Thread.sleep(1000);
driver.navigate().back();
driver.findElement(By.id("name")).sendKeys("Yashwanth");
Thread.sleep(1000);
driver.findElement(By.id("phone")).sendKeys("8374691200");
Thread.sleep(1000);
driver.findElement(By.id("email")).sendKeys("byashwanth@gmail.com");
Thread.sleep(1000);
driver.findElement(By.id("password")).sendKeys("@bc12345");
Thread.sleep(1000);
driver.findElement(By.id("address")).sendKeys("10-6,p&t colony");
Thread.sleep(1000);
driver.findElement(By.id("male")).click();
Thread.sleep(1000);
driver.findElement(By.id("monday")).click();
Thread.sleep(1000);
driver.findElement(By.id("tuesday")).click();
Thread.sleep(1000);
driver.findElement(By.id("wednesday")).click();
Thread.sleep(1000);
driver.findElement(By.id("thursday")).click();
Thread.sleep(1000);
driver.findElement(By.id("friday")).click();
Thread.sleep(1000);
driver.findElement(By.id("saturday")).click();
Thread.sleep(1000);
driver.findElement(By.id("sunday")).click();
Thread.sleep(1000);
Select options=new Select(driver.findElement(By.xpath("//select[@class='custom-select']")));
options.selectByVisibleText("Turkey");
Thread.sleep(1000);
driver.findElement(By.xpath("//label[normalize-space()='4 years']")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//label[normalize-space()='Selenium Webdriver']")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//label[normalize-space()='Cucumber']")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//label[normalize-space()='TestNG']")).click();
Thread.sleep(1000);
Actions actions=new Actions(driver);
actions.click(driver.findElement(By.xpath("//*[@id=\"inputGroupFile02\"]"))).build().perform();
driver.quit();




























	}

}
