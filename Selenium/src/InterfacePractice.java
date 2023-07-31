interface An
{
	public abstract void display();
	public abstract  void show();
}

abstract class Bn implements An
{
	
}
class Cn extends Bn
{
	public void display()
	{
		System.out.println("Display");
	}

	 public void show()
	{
		 System.out.println("Show");
	}
}
class InterfacePractice
{
	public static void main(String[] args)
	{
		Cn x=new Cn();
		x.display();
		x.show();
		Bn b=new Cn();
		b.display();
		b.show();
	}
}