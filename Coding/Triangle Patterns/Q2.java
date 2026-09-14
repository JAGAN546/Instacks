import java.util.*;
class Q2
{
	public static void main(String[]args)
	{
		//Write your code here.
		Scanner sc=new Scanner(System.in);
		int i,j,n;
		n=sc.nextInt();
		if(n==0)
			System.out.println("Invalid Input");
		else
		{
			if(n<0)
				n=-n;
				for(i=1;i<=n;i++)
				{
					for(j=1;j<=n;j++)
					{
						if(j<=i-1)
						{
							System.out.print(" ");
						}
						else
							System.out.print("* ");
					}
					System.out.println();
				}
		}
	}
}