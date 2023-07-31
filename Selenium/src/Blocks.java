public class Blocks {
	int i,j,k;
	{
		int i=1;j=2;k=3;
		System.out.println(i+"\t"+j+"\t"+k);
		this.i=100;
		this.j=200;
		this.k=300;
		this.display();
		this.show();
	}
	public void display()
	{
		System.out.println(i+"\t"+j+"\t"+k);
	}
	public void show()
	{
		System.out.println(i+"\t"+j+"\t"+k);
	}
public static void main(String[] args)
{
	Blocks b=new Blocks();
	b.display();
	b.show();
}
}
