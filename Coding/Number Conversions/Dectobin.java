import java.util.*;
class Dectobin
{
	static String dectobin(int dec)
	{
		String bin="";
		int i,d,t;
		t=dec;
		while(t>0)
		{
			d=t%2;
			bin=d+bin;
			t/=2;
		}
		return bin;
	}
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int dec=sc.nextInt();
		if(dec<0)
		{
			dec=-dec;
			//System.out.println(dectobin(dec));
		}	
		else if(dec==0)
			System.out.println("Zero");
		//else
			System.out.println(dectobin(dec));
	}
}