import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Practice{
WebDriver driver;
@BeforeClass
public void openbrowser()
{
	System.setProperty("WebDriver.Driver","C:\\Users\\SONY\\Downloads\\ChromeDriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	
}
@AfterClass
public void closebrowser()
{
	driver.close();
}
@Test
public void google()
{
	driver.get("https://www.google.com/");
	 String Title=driver.getTitle();
	 Assert.assertEquals(Title, "Google");
	
}
@Test
public void facebook()
{
	 driver.get("https://www.facebook.com/");
	 String Title=driver.getTitle();
	 Assert.assertEquals(Title, "Facebook – log in or sign up");
}



}
