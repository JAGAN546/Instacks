import java.util.*;
class Q4
{
	public static void main(String[]args)
	{
		//Write your code here.
		Scanner sc=new Scanner(System.in);
		int i,j,n,c;
		n=sc.nextInt();
		if(n<=0)
			System.out.println("Invalid Input");
		else
		{
			// c=n;
			for(i=1;i<=n;i++)
			{
				for(j=1;j<=n;j++)
				{
					if(j<=n-i)
						System.out.print("");
					else
						System.out.print(j);
				}
				c=n-1;
				for(j=1;j<=n-1;j++)
				{
					if(j<=i-1)
					{
						System.out.print(c);
						c--;
					}
					else	
					{
						System.out.print("");
					}
				}
				System.out.println();
			}
			// c=n-1;
			for(i=1;i<=n-1;i++)
			{
				for(j=1;j<=n;j++)
				{
					if(j<=i)
						System.out.print("");
					else
						System.out.print(j);
					// c++;
				}
				c=n-1;
				for(j=1;j<=n-1;j++)
				{
					if(j<=n-i-1)
					{
						System.out.print(c);
						c--;
					}
				}
				System.out.println();
			}
		}
	}
}