import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WeBDriver.Driver","C:\\Users\\SONY\\Downloads\\WebDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.gmail.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		driver.findElement(By.xpath("//*[@id=\"initialView\"]/c-wiz/footer/ul/li[1]/a")).click();
//driver.close();
		driver.quit();
	}

}
