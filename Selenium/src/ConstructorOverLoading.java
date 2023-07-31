class Main
{
	public Main()
	{
		System.out.println("yashu");
	}
	public Main(int i)
	{
		System.out.println(i);
	}
public Main(String s)
{
	System.out.println(s);
}
public Main(float a)
{
System.out.println(a);
}
public Main(int i,float a)
{
	System.out.println(i+"\t"+a);
}
}
class ConstructorOverLoading
{
	public static void main(String[] args)
	{
	new	Main();
	//Main m=new Main(90);
	//Main m1=new Main("Yashu");
	//Main m2=new Main(9.9f);
	//Main m3=new Main(10,9.9f);
	//Main m4=new Main(80);
	
		
	}
}
