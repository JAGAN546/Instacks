import java.util.*;
class Hextodec
{
	static void hextodec(String s)
	{
		System.out.print(s+" -> ");
		char ch;
		int i,d,dec=0,p=0;
		for(i=s.length()-1;i>=0;i--)
		{
			ch=s.charAt(i);
			if(ch>='A' && ch<='F')
				dec+=(ch-55)*(int)Math.pow(16,p);
			else if(ch>='a' && ch<='f')
				dec+=(ch-87)*(int)Math.pow(16,p);
			else if(ch>='0' && ch<='9')	
				dec+=(ch-48)*(int)Math.pow(16,p);
			p++;
		}
		System.out.print(dec);
	}
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		//if(s.charAt(0)=='-')
			//s=s.substring(1);
		hextodec(s);
	}
}