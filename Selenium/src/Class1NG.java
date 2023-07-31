import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Class1NG {
@BeforeClass
public void logIn()
{
	System.out.println("Login Succesful");
}
@AfterClass
public void logOut()
{
	System.out.println("LogOut Succesful");
}
@Test(priority=1)
public void addItem()
{
	System.out.println("Select Item");
}
@Test(priority=2)
public void addVendor()
{
	System.out.println("Select Vendor");
}
@Test(priority=3)
public void addPayment()
{
	System.out.println("Select Payment");
}

}
