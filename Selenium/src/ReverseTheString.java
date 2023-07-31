
public class ReverseTheString {

	public static void main(String[] args) {
		String str="YASHU",nstr="";
		char ch;
		System.out.println(str);
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			nstr=ch+nstr;
			
		}
		System.out.println(nstr);
	}

}
