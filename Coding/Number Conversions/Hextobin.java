import java.util.*;
class Hextobin
{
	static void hextobin(String s)
	{
		//hex to dec
		int i,dec=0,p=0;
		char ch;
		//String dec="";
		for(i=s.length()-1;i>=0;i--)
		{

			ch=s.charAt(i);
			//System.out.println(ch);
			if(ch>='A' && ch<='F')
				dec+=(ch-55)*(int)Math.pow(16,p++);
			else if(ch>='a' && ch<='f')
				dec+=(ch-87)*(int)Math.pow(16,p++);
			else if(ch>='0' && ch<='9')
				dec+=(ch-48)*(int)Math.pow(16,p++);
			else
			{
				System.out.println("InvaliD Characters");
				return;
			}
		}
		//dec to bin
		int d;
		String bin="";
		if(dec==0)
		{
			System.out.println(0);
			return;
		}
		while(dec>0)
		{
			d=dec%2;
			bin=d+bin;
			dec/=2;
		}
		System.out.println(bin);
	}
	public static void main(String[]args)
	{
		//Write your code here.
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		hextobin(s);
	}
}