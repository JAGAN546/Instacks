import java.util.*;
class Q13
{
	public static void main(String[]args)
	{
		//Write your code here.
		Scanner sc=new Scanner(System.in);
		int i,j,n;
		n=sc.nextInt();
		if(n<=0)
			System.out.print("Invalid Input");
		else
		{
			for(i=1;i<=n;i++)
			{
				for(j=1;j<=n;j++)
				{
					if(j<=i-1)
						System.out.print("  ");
					else
						System.out.print(j+" ");
				}
				for(j=n-1;j>=i;j--)
				{
					System.out.print(j+" ");
				}
				System.out.println();
			}
			for(i=1;i<=n-1;i++)
			{
				for(j=1;j<=n;j++)
				{
					if(j<=n-i-1)
						System.out.print("  ");
					else
						System.out.print(j+" ");
				}
				int c=n-1;
				for(j=1;j<=n;j++)
				{
					if(j<=i)
					{
						System.out.print(c+" ");
						c--;
					}
				}
				System.out.println();
			}
		}
	}
}