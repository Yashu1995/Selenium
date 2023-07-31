
public class Palindrome {

	public static void main(String[] args) {
	 int i=123;
	 int sum=0;
	 int r;
	 while(i>0)
	 {
		 r=i%10;
		 sum=(sum*10)+r;
		 i=i/10;
	 }
	 System.out.print(sum);

	}

}
