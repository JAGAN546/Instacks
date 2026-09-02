import java.util.*;
class Octtodec
{
	static void octtodec(String s)
	{
		int i,p=0,c=0,dec=0;
		char ch;
		for(i=s.length()-1;i>=0;i--)
		{
			ch=s.charAt(i);
			if(ch>'8')
			{
				c++;
				break;
			}
			dec+=(ch-48)*(int)Math.pow(8,p++);
		}
		if(c==1)
			System.out.println("Invalid Input");
		else
			System.out.println(dec);
	}
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		if(s.charAt(0)=='-')
			s=s.substring(1);
		octtodec(s);
	}
}