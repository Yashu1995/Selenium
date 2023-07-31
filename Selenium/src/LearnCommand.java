import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnCommand {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("WebDriver.Driver","C:\\Users\\SONY\\Downloads\\ChromeDriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
driver.get("https://www.amazon.com/");
Thread.sleep(2000);
driver.navigate().refresh();
System.out.println(driver.getCurrentUrl());
System.out.println(driver.getTitle());
System.out.println(driver.getPageSource());
driver.navigate().to("https://www.flipkart.com/");
driver.navigate().back();
Thread.sleep(2000);
driver.navigate().refresh();
driver.navigate().forward();
System.out.println(driver.getCurrentUrl());
System.out.println(driver.getTitle());
System.out.println(driver.getPageSource());
driver.navigate().to("https://www.netflix.com");
Thread.sleep(2000);
driver.navigate().refresh();
System.out.println(driver.getCurrentUrl());
System.out.println(driver.getTitle());
System.out.println(driver.getPageSource());



	}

}
