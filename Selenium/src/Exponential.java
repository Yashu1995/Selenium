import java.util.Scanner;

public class Exponential {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Long X=sc.nextLong();
		Long Y=sc.nextLong();
		float P=1;
		for(int i=1;i<=Y;i++)
		{
			P=P*X;
			
		}
		System.out.println(P);
		

	}

}
