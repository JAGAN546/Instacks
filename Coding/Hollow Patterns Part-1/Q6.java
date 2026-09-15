import java.util.*;
class Q6
{
	public static void main(String[]args)
	{
		//Write your code here.
		Scanner sc=new Scanner(System.in);
		int i,j,n;
		n=sc.nextInt();
		if(n<=0)
			System.out.println("Invalid Input");
		else
		{
			for(i=n;i>=1;i--)
			{
				for(j=i;j>=1;j--)
				{
					if(j>1 && j<i && i<n)
						System.out.print("  ");
					else
						System.out.print("* ");
				}
				System.out.println();
			}
		}
	}
}