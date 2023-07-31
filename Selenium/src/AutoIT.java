import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class AutoIT {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("WebDriver.Driver","C:\\Users\\SONY\\Downloads\\ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("YASHWANTH");
		Thread.sleep(1000);
		driver.findElement(By.xpath("	//input[@placeholder='Last Name']	")).sendKeys("Kumar");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).sendKeys("Dilsukhnagar");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("byashwanthkumar@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("123456789");
		Thread.sleep(1000);
		driver.findElement(By.xpath("	//input[@value='Male']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='checkbox1']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='checkbox2']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='checkbox3']")).click();
		Thread.sleep(1000);
		Select s=new Select(driver.findElement(By.id("Skills")));
		s.selectByIndex(4);
		Thread.sleep(1000);
		Select s1=new Select(driver.findElement(By.xpath("//*[@id=\"country\"]")));
		s1.selectByValue("India");
		Thread.sleep(1000);
		Select s2=new Select(driver.findElement(By.xpath("//*[@id=\"yearbox\"]")));
		s2.selectByValue("1995");
		Thread.sleep(1000);
		Select s3=new Select(driver.findElement(By.xpath("//select[@placeholder='Month']")));
		s3.selectByIndex(3);
		Thread.sleep(1000);
		Select s4=new Select(driver.findElement(By.xpath("//*[@id=\"daybox\"]")));
		s4.selectByIndex(9);
		Thread.sleep(1000);
		driver.findElement(By.id("firstpassword")).sendKeys("123456789");
		Thread.sleep(1000);
		driver.findElement(By.id("secondpassword")).sendKeys("123456789");
		Thread.sleep(1000);
		driver.findElement(By.id("submitbtn")).click();
		Thread.sleep(1000);
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.findElement(By.id("Button1")).click();
		Thread.sleep(1000);
		Actions a=new Actions(driver);
		a.click(driver.findElement(By.id("imagesrc"))).build().perform();
		Thread.sleep(3000);
		driver.quit();
		
		
		
		
	}

}
