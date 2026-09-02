import java.util.*;
class Octtohex
{
	static void octtohex(String s)
	{
		char ch;
		int dec=0,c=0,p=0,i;
		for(i=s.length()-1;i>=0;i--)
		{
			ch=s.charAt(i);
			if(ch>='0' && ch<='7')
			{
				dec+=(ch-48)*(int)Math.pow(8,p);
			}
			else
			{
				c++;
				break;
			}
			p++;
		}
		if(c!=0)
			System.out.println("InvalId Input");
		else
		{
			String hex="";
			int d,t;
			t=dec;
			if(t==0){
				System.out.println(0);
				return;
			}
			while(t!=0)
			{
				d=t%16;
				if(d>9 && d<=15)
					hex=(char)(d+55)+hex;
				else
					hex=d+hex;
				t/=16;
			}
			System.out.println(hex);
		}
	}
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		if(s.charAt(0)=='-')
			s=s.substring(1);
		octtohex(s);
	}
}