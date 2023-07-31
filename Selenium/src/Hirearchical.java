class Employee 
	{
	float Salary=40000;
		void Salary()
		{
			System.out.println("Employee Salary is:"+Salary);
		}
	}
class Permanent extends Employee
{
	double hike=0.5;
	void IncrementSalary()
	{
		super.Salary();
		System.out.println("Permanent Employee Salary hike is:"+(Salary+(Salary*hike)));
	}
}
class Temporary extends Employee
{
	double hike=0.35;
	void IncrementSalary()
	{
		super.Salary();
		System.out.println("Temporary Employee Salary hike is:"+(Salary+(Salary*hike)));
	}
}
class Hirearchical
{
	public static void main(String[] args) 
	{
	Permanent p=new Permanent();
	p.IncrementSalary();
	Temporary t=new Temporary();
	t.IncrementSalary();
	Employee e=new Permanent();
	e.Salary();
	
		
		
		
		
		
		
		
		
	
	}

}
