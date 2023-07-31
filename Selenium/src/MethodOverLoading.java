class MethodOverLoading 
{
	void add(int a,int b)
	{
		System.out.println(a+b);}
	void add(float b,int a )
	{
		System.out.println(a-b);

	}
void add(int a,float b)
{
	System.out.println(a+"\t"+b);
}
void add(float a,float b)
{
	System.out.println(a+"\t"+b);
}

public static void main(String[] args)
{
MethodOverLoading mo=new MethodOverLoading();
mo.add(88,90);
mo.add(9f,40);
mo.add(9f,9f);
mo.add(9f,40f);
}

}