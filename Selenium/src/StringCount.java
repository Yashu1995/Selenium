public class StringCount
{
	public static void main(String[] args)
	{
		/*String string="Yashwanth";
		int count=0;
		for(int i=0;i<string.length();i++)
		{
			if(string.charAt(i)!=' ')
				count++;
		}
		System.out.println(count);*/
		String str="kumar",nstr="";
		char ch;
		for(int i=0;i<str.length();i++)
		{
			ch=str.charAt(i);
			nstr=ch+nstr;
			
		}
		System.out.println(nstr);
		
	}
}