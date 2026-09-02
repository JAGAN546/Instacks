import java.util.*;
class Bintohex
{
	static void bintohex(String s)
	{
		//bin to dec
		char ch;
		int p=0,i,dec=0;
		for(i=s.length()-1;i>=0;i--)
		{
			//if(s.charAt(i)=='-'){}
				ch=s.charAt(i);
				dec+=(ch-48)*(int)Math.pow(2,p++);
		}
		//dec to hex
		int d;
		String hex="";
		if(dec==0)
		{
			System.out.println("0");
			return;
		}
		else
		{
		while(dec>0)
		{
			d=dec%16;
			if(d>=0 && d<=9)
				hex=d+hex;
			else 
				hex=(char)(d+55)+hex;
			dec/=16;
		}
		System.out.println(hex);
		}
	}
	public static void main(String[]args)
	{
		//Write your code here.
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		for(int i=s.length()-1;i>=0;i--)
		{
			int c=0;
			char ch=s.charAt(i);
			if(ch!='1' && ch!='0' && ch!='-')
			{
			 	if(ch>='2' && ch<='9')
					System.out.println("Invalid input because of invalid Digits");
				else if(ch>='a' && ch<='z')
					System.out.println("Invalid input because of small characters");
				else if(ch>='A' && ch<='Z')
					System.out.println("Invalid input because of Capital characters");
				else
					System.out.println("Invalid input because of Special characters");
				return;
			}
		}
		bintohex(s);
	}
}