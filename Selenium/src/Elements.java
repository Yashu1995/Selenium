import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elements {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.Driver", "C:\\Users\\SONY\\Downloads\\WebDriver.exe");
WebDriver driver=new ChromeDriver();
String Url=("https://www.instagram.com");
driver.get(Url);
Thread.sleep(3000);
driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[1]/div/label/input")).sendKeys("yashwanth");
driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[2]/div/label/input")).sendKeys("123456789");
driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]")).click();



	}

}
