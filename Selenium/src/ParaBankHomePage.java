import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ParaBankHomePage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("Web Driver.Driver","C:\\\\Users\\\\SONY\\\\Downloads\\\\ChromeDRiver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://parabank.parasoft.com/parabank/index.htm");
		Thread.sleep(2000);
		driver.manage().window().maximize();
    driver.findElement(By.xpath("//*[@id=\"headerPanel\"]/ul[1]/li[2]/a")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"headerPanel\"]/ul[1]/li[3]/a")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"headerPanel\"]/ul[1]/li[4]/a")).click();
	Thread.sleep(2000);
	driver.get("https://parabank.parasoft.com/parabank/index.htm");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"headerPanel\"]/ul[1]/li[5]/a")).click();
	Thread.sleep(2000);
	driver.get("https://parabank.parasoft.com/parabank/index.htm");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"headerPanel\"]/ul[1]/li[6]/a")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"headerPanel\"]/ul[2]/li[1]/a")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"headerPanel\"]/ul[2]/li[2]/a")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"headerPanel\"]/ul[2]/li[3]/a")).click();
	Thread.sleep(2000);
	driver.findElement(By.name("username")).sendKeys("Yashwanth");
	Thread.sleep(2000);
	driver.findElement(By.name("password")).sendKeys("Yashwanth");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/p[1]/a")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/p[2]/a")).click();
	Thread.sleep(2000);
	driver.get("https://parabank.parasoft.com/parabank/index.htm");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/ul[1]/li[2]/a")).click();
	Thread.sleep(2000);
	driver.get("https://parabank.parasoft.com/parabank/index.htm");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/ul[1]/li[3]/a")).click();
	Thread.sleep(2000);
	driver.get("https://parabank.parasoft.com/parabank/index.htm");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/ul[1]/li[4]/a")).click();
	Thread.sleep(2000);
	driver.get("https://parabank.parasoft.com/parabank/index.htm");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/ul[1]/li[5]/a")).click();
	Thread.sleep(2000);
	driver.get("https://parabank.parasoft.com/parabank/index.htm");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/ul[2]/li[2]/a")).click();
	Thread.sleep(2000);
	driver.get("https://parabank.parasoft.com/parabank/index.htm");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/ul[2]/li[3]/a")).click();
	Thread.sleep(2000);
	driver.get("https://parabank.parasoft.com/parabank/index.htm");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/ul[2]/li[4]/a")).click();
	Thread.sleep(2000);
	driver.get("https://parabank.parasoft.com/parabank/index.htm");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/p[1]/a")).click();
	Thread.sleep(2000);
	driver.get("https://parabank.parasoft.com/parabank/index.htm");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/ul[3]/li[2]/a")).click();
	Thread.sleep(2000);
	driver.get("https://parabank.parasoft.com/parabank/index.htm");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/ul[3]/li[3]/a")).click();
	Thread.sleep(2000);
	driver.get("https://parabank.parasoft.com/parabank/index.htm");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/ul[3]/li[4]/a")).click();
	Thread.sleep(2000);
	driver.get("https://parabank.parasoft.com/parabank/index.htm");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/p[2]/a")).click();
	Thread.sleep(2000);
	driver.get("https://parabank.parasoft.com/parabank/index.htm");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"footerPanel\"]/ul[1]/li[1]/a")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"footerPanel\"]/ul[1]/li[2]/a")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"footerPanel\"]/ul[1]/li[3]/a")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"footerPanel\"]/ul[1]/li[4]/a")).click();
	Thread.sleep(2000);
	driver.get("https://parabank.parasoft.com/parabank/index.htm");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"footerPanel\"]/ul[1]/li[5]/a")).click();
	Thread.sleep(2000);
	driver.get("https://parabank.parasoft.com/parabank/index.htm");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"footerPanel\"]/ul[1]/li[6]/a")).click();
	Thread.sleep(2000);
	driver.get("https://parabank.parasoft.com/parabank/index.htm");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"footerPanel\"]/ul[1]/li[7]/a")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"footerPanel\"]/ul[1]/li[8]/a")).click();
	Thread.sleep(2000);
driver.quit();
	
		}
	
}
