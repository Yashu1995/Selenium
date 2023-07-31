import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("WebDriver.Driver","C:\\Users\\SONY\\Downloads\\ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("Facebook.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[1]/div/div[1]/a")).click();
		Thread.sleep(2000);
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[1]/div/div[2]/a")).click();
		Thread.sleep(2000);
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.findElement(By.className("gb_h")).click();
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[2]/a/span")).click();
		Thread.sleep(2000);
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();
		Thread.sleep(2000);
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[2]")).click();
		Thread.sleep(2000);
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[3]/div[2]")).click();
		driver.get("https://www.google.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[3]/div[3]")).click();
		Thread.sleep(3000);
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"SIvCob\"]/a[1]")).click();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"SIvCob\"]/a[2]")).click();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"SIvCob\"]/a[3]")).click();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"SIvCob\"]/a[4]")).click();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"SIvCob\"]/a[5]")).click();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"SIvCob\"]/a[6]")).click();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"SIvCob\"]/a[7]")).click();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"SIvCob\"]/a[8]")).click();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"SIvCob\"]/a[9]")).click();
		Thread.sleep(2000);
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"SIvCob\"]/a[1]")).click();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/div[1]/a[1]")).click();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//html/body/div[1]/div[5]/div[2]/div[1]/a[2]")).click();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//html/body/div[1]/div[5]/div[2]/div[1]/a[3]")).click();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//html/body/div[1]/div[5]/div[2]/div[1]/a[4]")).click();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/div[2]/a[1]")).click();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/div[2]/a[2]")).click();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/div[2]/span/span/g-popup/div[1]/div")).click();
		Thread.sleep(2000);
		driver.quit();
		
		
	}

}
