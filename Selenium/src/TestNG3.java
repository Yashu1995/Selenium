import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class TestNG3 {
	WebDriver driver;
	@Test
	public void Display() throws InterruptedException
	{
		System.setProperty("WebDriver.Driver","C:\\Users\\SONY\\Downloads\\ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hdfcbank.com/");
		Thread.sleep(1000);
String Title=driver.getTitle();
System.out.println(Title);
Assert.assertEquals(Title,"HDFC Bank – Personal Banking & Netbanking Services");
driver.close();
}
}
