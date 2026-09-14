import java.util.*;
class Q8
{
	static void pattern(int n)
	{
		int i,j,c;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n;j++)
			{
				if(j<=i-1)
					System.out.print(" ");
				else
					System.out.print(j);
			}
			c=n-1;
			for(j=1;j<=n-1;j++)
			{
				if(j<=n-i)
					System.out.print(c);
				c--;
			}
			System.out.println();
		}
	}
	public static void main(String[]args)
	{
		//Write your code here.
		Scanner sc=new Scanner(System.in);
		int n;
		n=sc.nextInt();
		if(n<0)
		{
			n=-n;
			if(n%2!=0)
				System.out.print("Invalid Input");
			else
				pattern(n);
		}
		else if(n>0)
		{
			if(n%2==0)
				System.out.print("Invalid Input");
			else
				pattern(n);
		}
		else
			System.out.print("Invalid Input");
	}
}