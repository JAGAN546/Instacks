import java.util.*;
class Bintooct
{
	static void bintooct(String s)
	{
		int c=0,p=0,dec=0,i;
		char ch;
		for(i=s.length()-1;i>=0;i--)
		{
			ch=s.charAt(i);
			if(ch=='1')
				dec+=1*(int)Math.pow(2,p);
			else if(ch=='0')
				dec+=0*(int)Math.pow(2,p);
			else	
			{
				c++;
				break;
			}
			p++;
		}
		if(c!=0)
			System.out.println("Invalid InPut");
		else
		{
			String b="";
			int t=dec,d;
			if(t==0)
				System.out.println(0);
			while(t!=0)
			{
				d=t%8;
				b=d+b;
				t/=8;
			}
			System.out.println(b);
		}
	}
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		bintooct(s);
	}
}