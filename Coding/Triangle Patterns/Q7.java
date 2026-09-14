import java.util.*;
class Q7
{
	public static void main(String[]args)
	{
		//Write your code here.
		Scanner sc=new Scanner(System.in);
		int i,j,n,t;
		n=sc.nextInt();
		if(n<=0)
			System.out.println("Invalid Input");
		else
		{
			t=n;
			for(i=1;i<=n;i++)
			{
				for(j=1;j<=n;j++)
				{
					if(j<=i-1)
						System.out.print(" ");
					else
						System.out.print(t);
				}
				for(j=1;j<=n-i;j++)
				{
					System.out.print(t);
				}
				t--;
				System.out.println();
			}
		}
	}
}