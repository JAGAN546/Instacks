import java.util.*;
class Q5
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
			for(i=1;i<=n;i++)
			{
				c=1;
				for(j=1;j<=n;j++)
				{
					if(j<=n-i)
						System.out.print(" ");
					else
					{
						System.out.print(c);
						c++;
					}
				}
				c=i-1;
				for(j=1;j<=i-1;j++)
				{
					System.out.print(c);
					c--;
				}
				System.out.println();
			}
			for(i=1;i<=n-1;i++)
			{
				c=1;
				for(j=1;j<=n;j++)
				{
					if(j<=i)
						System.out.print(" ");
					else
					{
						System.out.print(c);
						c++;
					}
				}
				c=n-i-1;
				for(j=c;j>=1;j--)
				{
					System.out.print(j);
				}
				System.out.println();
			}
		}
	}
}