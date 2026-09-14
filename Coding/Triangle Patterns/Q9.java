import java.util.*;
class Q9
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
				for(j=1;j<=n;j++)
				{
					if(j<=n-i)
						System.out.print(" ");
					else
						System.out.print(j-n+i);
				}
				c=i-1;
				for(j=1;j<=n-1;j++)
				{
					if(j<=i-1)
					{
						System.out.print(c);
					}
					c--;
				}
				System.out.println();
			}
		}
	}
}