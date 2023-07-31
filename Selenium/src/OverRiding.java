
class A
{
void Airtel()
{
	System.out.println("Hello Airtel");
	}
}
class B extends A
{
	void Airtel()
{
	System.out.println("Sim price is :"+60);
}
}
class OverRiding
{
	public static void main (String[] args)
	{
		A a=new A();
		a.Airtel();
		B b=new B();
		b.Airtel();
		A x=new B();
		x.Airtel();
		
	}
}

