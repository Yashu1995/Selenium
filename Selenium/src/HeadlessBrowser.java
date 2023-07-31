import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessBrowser {

	public static void main(String[] args) {
		System.setProperty("WebDriver.Driver","C:\\Users\\SONY\\Downloads\\ChromeDriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("HeadLess");	
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());

	}

}
