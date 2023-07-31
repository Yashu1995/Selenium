import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeMethodTestNG {
WebDriver driver;
@BeforeMethod
void openBrowser()
{
	System.setProperty("WebDriver.Driver","C:\\Users\\SONY\\Downloads\\ChromeDriver.exe");
driver=new ChromeDriver();
	
	
}
@AfterMethod
void closeBrowser()
{
driver.close();
}
@Test(priority=3)
void Google()
{
	driver.get("https://www.google.com/");
	String Title=driver.getTitle();
	Assert.assertEquals(Title,"Google");
}
@Test(priority=1)
void Facebook()
{
	driver.get("https:www.facebook.com");
	String Title=driver.getTitle();
	Assert.assertEquals(Title,"Facebook – log in or sign up");
}
@Test(priority=2)
void Instagram()
{
	driver.get("https://www.instagram.com/");
	String Title=driver.getTitle();
	Assert.assertEquals(Title,"Instagram");
}

	
	
	
	
	
	
	
	
	
	
	
	
	
}




