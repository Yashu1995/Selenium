import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YouTube {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.Driver","C:\\Users\\SONY\\Downloads\\ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com");
		Thread.sleep(3000);
		driver.findElement(By.name("search_query")).sendKeys("Telugu Song o rendu prema meghalu");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"search-icon-legacy\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"video-title\"]/yt-formatted-string")).click();
		Thread.sleep(1000);
	}
}
