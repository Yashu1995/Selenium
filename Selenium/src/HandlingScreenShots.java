import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingScreenShots {

	public static void main(String[] args) throws IOException {
		System.setProperty("WebDriver.Chrome.Driver", "C:\\Users\\SONY\\Downloads\\ChromeDriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
driver.manage().window().maximize();
TakesScreenshot tss=(TakesScreenshot)driver;
File src=tss.getScreenshotAs(OutputType.FILE);
File des=new File("C:\\Users\\SONY\\Desktop\\demo.png");
FileUtils.copyFile(src, des);

}
}