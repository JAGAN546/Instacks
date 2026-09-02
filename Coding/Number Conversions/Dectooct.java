import java.util.*;
class Dectooct
{
	static void dectooct(int n)
	{
		int d,i,t=n;
		String oct="";
		while(t>0)
		{
			d=t%8;
			oct=d+oct;
			t/=8;
		}
		System.out.println(oct); 
	}
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n<0)
			System.out.println("INVALID Input");
		else if(n==0)
			System.out.println("ZERO");
		else	
			dectooct(n);
	}
}