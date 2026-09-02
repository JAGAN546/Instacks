import java.util.*;
class Octtobin
{
	static void octtobin(String s)
	{
		//octtodec
		int dec=0,c=0,p=0,i;
		char ch;
		for(i=s.length()-1;i>=0;i--)
		{
			ch=s.charAt(i);
			if(ch>='8')
			{
				c++;
				break;
			}
			dec+=(ch-48)*(int)Math.pow(8,p++);
		}
		if(c!=0)
			System.out.println("InvalId Input");
		else
		{
			//dectobin
			int d,t=dec;
			String bin="";
			//if(t==0)
				//System.out.println(0);
			while(t!=0)
			{
				d=t%2;
				bin=d+bin;
				t/=2;
			}
			System.out.println(bin);
		}
	}
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		octtobin(s);
	}
}