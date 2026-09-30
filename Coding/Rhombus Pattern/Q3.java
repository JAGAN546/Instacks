import java.util.*;
class Q3
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
			for(i=1;i<=n;i++)
			{
				for(j=1;j<=n;j++)
				{
					if(n<=9)
					{
						if(j<=n-i)
							System.out.print(" ");
						else
							System.out.print(i+" ");
					}
					else
					{
						if(i<10)
						{
							if(j<=n-i)
								System.out.print("  ");
							else
								System.out.print(" "+i+"  ");
						}
						else{
							if(j<=n-i)
							 	System.out.print("  ");
							else
								System.out.print(i+"  ");
						}
					}
				}
				System.out.println();
			}
			for(i=2;i<=n;i++)
			{
				//int c=n-i;
				for(j=1;j<=n;j++)
				{
					if(n<=9)
					{
						if(j<i)
							System.out.print(" ");
						else
							System.out.print(n-i+1+" ");
					}
					else
					{
						// System.out.print(j);
						if(n-i+1>=10)
						{
							if(j<i)
								System.out.print("  ");
							else
								System.out.print((n-i+1)+"  ");
						}
						else{
							if(j<i)
								System.out.print("  ");
							else
								System.out.print(" "+(n-i+1)+"  ");
						}
					}
				}
				System.out.println();
			}
		}
	}
}