import java.util.*;
class BintoDec
{
	static void bintodec(String s)
	{
		int l,i,c=0,dec=0,p=0;
		char ch;
		l=s.length();
		for(i=l-1;i>=0;i--)
		{
			ch=s.charAt(i);
			if(ch=='1') 
			{
				dec+=(ch-48)*(int)Math.pow(2,p);
				p++;
			}
			else if(ch=='0')
			{
				dec+=(ch-48)*(int)Math.pow(2,p);
				p++;
			}
			else
			{
				c++;
				break;
			}
		}
		if(c!=0)
			System.out.println("InvAlid Input.");
		else
			System.out.println(dec);
	}
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		/*if(s.!equalsto("1"||"0"))
			System.out.println("InvAlid Input.");
		else
		{*/
		bintodec(s);
		//}
	}
}