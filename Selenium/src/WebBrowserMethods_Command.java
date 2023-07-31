import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebBrowserMethods_Command {
public static void main(String[] args) {
System.setProperty("WebDriver.driver", "C:\\Users\\SONY\\Download\\ChromeDriver.exe");
WebDriver driver=new ChromeDriver();
String url=("https://www.facebook.com/login/");
driver.get(url);
String Title=driver.getTitle();
int Titlelength=driver.getTitle().length();
System.out.println(Title);
System.out.println(Titlelength);
String actualurl=driver.getCurrentUrl();
if(actualurl.equals("https://www.facebook.com/login/")) {
	System.out.println("Verification SuccessFull");}
else {
	System.out.println("Verification Failed");}
String pagesource=driver.getPageSource();
int pagesourcelength=pagesource.length();
System.out.println(pagesourcelength);
driver.close();

	
}


}
