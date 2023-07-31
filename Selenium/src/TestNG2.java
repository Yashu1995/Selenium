import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class TestNG2 {
WebDriver driver;
@Test
public void TestNG2() throws InterruptedException
{
	System.setProperty("WebDriver.Driver","C:\\Users\\SONY\\Downloads\\ChromeDriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.gmail.com");
	Thread.sleep(2000);
	String Title=driver.getTitle();
	System.out.println(Title);
	Assert.assertEquals(Title, "Gmail");
	driver.close();
	
}
}
