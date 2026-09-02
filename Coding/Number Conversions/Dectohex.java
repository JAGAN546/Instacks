import java.util.*;
class Dectohex
{
	static void dectohex(int n)
	{
		int i,d,t=n;
		String dec="";
		//char ch;
		//if(t==0)
			//System.out.println("0");
		while(t>0)
		{
			d=t%16;
			if(d>9 && d<=15)
				dec=(char)(d+55)+dec;
			else
				dec=d+dec;
			t/=16;
		}
		System.out.println(dec);
	}
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n<0)
			n=Math.abs(n);
		if(n==0)
			System.out.println("Given Input is InValid.");
		else	
			dectohex(n);
	}
}