
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNGpractice{
	WebDriver driver;
	@BeforeClass
	public void webdriver() throws InterruptedException
	{
		System.setProperty("WebDriver.Driver","C:\\Users\\SONY\\Downloads\\ChromeDriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
	
	}
	
	@AfterClass
	public void close()
	{
		driver.close();
	}
@Test(priority=4)
public void URL()
{
	driver.get("https://www.facebook.com/");
}
	
@Test(priority=3)
public void mainURL1() throws InterruptedException
{
	driver.get("https://www.youtube.com/");
	
}
@Test(priority=2)
public void mainURL2() throws InterruptedException
{
	driver.get("https://www.instagram.com/");
	
}	
@Test(priority=1)
public void mainURL3() throws InterruptedException
{
	driver.get("https://www.google.com/");
	
}
	
	
	
	
	
	
	
	
}