import java.util.*;
class Q3
{
	public static void main(String[]args)
	{
		//Write your code here.
		Scanner sc=new Scanner(System.in);
		int i,j,n,m;
		n=sc.nextInt();
		m=sc.nextInt();
		if(n<=0 || m<=0)
			System.out.println("Invalid Inputs");
		else
		{
			for(i=1;i<=n;i++)
			{
				for(j=1;j<=m;j++)
				{
					if(j>1 && j<m && i>1 && i<n)
						System.out.print("  ");
					else
						System.out.print("* ");
				}
				System.out.println();
			}
		}
	}
}