import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestNG {
	WebDriver driver;
	@Test
	public void Display()
	{
		System.setProperty("WebDriver.Driver","C:\\Users\\SONY\\Downloads\\ChromeDriver.exe");
 driver=new ChromeDriver();
 driver.get("https://www.google.com/");
 String Title=driver.getTitle();
 Assert.assertEquals(Title, "Google");
 driver.close();
	}

}
