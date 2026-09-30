import java.util.*;
class Q6
{
	public static void main(String[]args)
	{
		//Write your code here.
		Scanner sc=new Scanner(System.in);
		int i,j,n,m;
		n=sc.nextInt();
		m=sc.nextInt();
		if(n<=0 && m<=0)
			System.out.println("Invalid Inputs");
		else if(n<=0)
			System.out.println("Given Row Value is Invalid");
		else if(m<=0)
			System.out.println("Given Starting Value is Invalid");
		else
		{
			for(i=1;i<=n;i++)
			{
				for(j=1;j<=i;j++)
				{
					System.out.print(m);
				}
				m++;
				System.out.println();
			}
			int d=m-2;
			for(i=n-1;i>=1;i--)
			{
				for(j=i;j>=1;j--)
				{
					System.out.print(d);
				}
				d--;
				System.out.println();
			}
		}
	}
}