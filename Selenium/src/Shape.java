interface InterfacePractices {
double pie=3.12;
void area();
}
 class Circle implements InterfacePractices
{
	 public void area()
	{
	double a;
	double r=10;
	a=pie*r*r;
	System.out.println("area of circle:"+a);
	}	
}
class Square implements InterfacePractices
{
	public void area()
	{
	double a;
	double s=15;
	a=s*s;
	System.out.println("area of Square:"+a);
	}
}
 class Rectangle implements InterfacePractices
{
	public void area()
	{
		double a;
		double re=25;
		a=pie*re;
		System.out.println("Area of Rectangle is :"+a);
		
	}
}
class Shape
{
	public static void main(String[] args)
	{
Circle c=new Circle();
Square s=new Square();
Rectangle r=new Rectangle();
c.area();
s.area();
r.area();
InterfacePractices ip=new Circle();
ip.area();
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}