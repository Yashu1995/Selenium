import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Class2NG {
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
public void deleteItem()
{
	System.out.println("Delete Selected Item");
}
@Test(priority=2)
public void deleteVendor()
{
	System.out.println("Delete Selected Vendor");
}
@Test(priority=3)
public void deletePayment()
{
	System.out.println("Delete Selected Payment");
}

}
