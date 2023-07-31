import java.util.*;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Long X=sc.nextLong();
		float F=1;
		for(Long i=X;i>=1;i--)
		{
			 F=F*i;
			
		}
		System.out.println(F);
		

	}

}
