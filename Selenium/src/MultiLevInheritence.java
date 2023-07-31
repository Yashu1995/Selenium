
class E
{
  void Bike()
	{
System.out.println("Welcome to Hero Honda");

}
}
class F extends E
{
	void Price()
	{
		System.out.println("Hero Honda Bike Price is 1 lakh");
	}
}
class G extends E
{
	void Insurance()
	{
	System.out.println("Hero Honda Bike Insurance is 50k");
}
}
class MultiLevInheritence
{
	public static void main(String[] args)
	{
		E e=new E();
		e.Bike();
		F f=new F();
		f.Bike();
		f.Price();
		G g=new G();
		g.Insurance();
		E x=new F();
		x.Bike();
		E y=new G();
		y.Bike();
		
		
		
		
		
		
	}
}