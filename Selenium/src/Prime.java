import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Long X=sc.nextLong();
		float P=0;
		for(int i=1;i<=X;i++)
		if(X%i==0)
		{
		
			P++;
			
		}
		if(P==2)
		{
		System.out.println("Number is Prime");
		}
		else
		{
			System.out.println("Number is not Prime");

	}

}
}
