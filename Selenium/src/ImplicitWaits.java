import java.util.Set;
import java.time.Duration;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ImplicitWaits {

	public static void main(String[] args) {
		System.setProperty("WebDriver.Driver","C:\\Users\\SONY\\Downloads\\ChromeDRiver.exe");
		WebDriver driver=new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10)); 
		driver.get("https://testproject.io/");
		String parentWindow=driver.getWindowHandle();
			driver.findElement(By.linkText("Login")).click();
			Set<String> windowHandles=driver.getWindowHandles();
			for(String windowHandle:windowHandles)
			{
				if(!windowHandle.equals(parentWindow))
				{
					driver.switchTo().window(windowHandle);
					wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
					driver.findElement(By.id("username")).sendKeys("Yashu");
					
					
				}
			}
		
		
}
}