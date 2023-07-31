import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orangehrm {

	public static void main(String[] args) {
		System.setProperty("WebDriver.Driver","C:\\Users\\SONY\\Downloads\\ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/validateCredentials");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		//driver.findElement(By.cssSelector("#txtUsername")).sendKeys("Yashwanth");
		//driver.findElement(By.cssSelector("#txtPassword")).sendKeys("Yashwanth");
		//String text=driver.findElement(By.cssSelector(".form-hint")).getText();
		//Writing a dynamic CSS locator using Class Element
		//System.out.println(text);
		driver.get("http://orangehrm.qedgetech.com/symfony/web/index.php/auth/validateCredentials");
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
