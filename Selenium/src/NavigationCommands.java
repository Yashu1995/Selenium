import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.Driver","C:\\Users\\SONY\\Downloads\\ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.navigate().to("https://www.facebook.com");//to open a second browser
		Thread.sleep(2000);
		driver.navigate().back();//go back to the first browser
		Thread.sleep(2000);
		driver.navigate().forward();//to get the second browser
		Thread.sleep(2000);
		driver.navigate().refresh();//to refresh the browsers
		Thread.sleep(2000);
	}

}
