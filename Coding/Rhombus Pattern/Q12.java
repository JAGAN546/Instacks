import java.util.*;
class Q12
{
	public static void main(String[]args)
	{
		//Write your code here.
		Scanner sc=new Scanner(System.in);
		int n,i,j;
		n=sc.nextInt();
		if(n<=0)
			System.out.println("Invalid Input");
		else
		{
			for(i=1;i<=n;i++)
			{
				for(j=1;j<=n;j++)
				{
					if(j<=i-1)
						System.out.print(" ");
				}
				for(j=1;j<=n;j++)
					System.out.print("*");
				System.out.println();
			}
		}
	}
}