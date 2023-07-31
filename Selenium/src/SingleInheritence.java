
class C
{
  void Bike()
	{
System.out.println("Welcome to Hero Honda");

}
}
class D extends C
{
	void Price()
	{
		System.out.println("Hero Honda Bike Price is 1 lakh");
	}
}
class SingleInheritence
{
	public static void main(String[] args)
	{
		D d=new D();
		d.Bike();
		d.Price();
		
		
	}
}