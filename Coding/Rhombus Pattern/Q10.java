import java.util.*; 
class Q10
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
					if(j<=n-i)
						System.out.print(" ");
					else
					{
						if(i%2==1)
							System.out.print("* ");
						else
							System.out.print("# ");
					}
				}
				System.out.println();
			}
			for(i=1;i<=n-1;i++)
			{
				for(j=1;j<=n;j++)
				{
					if(j<=i)
						System.out.print(" ");
					else
					{
						if(n%2==0)
						{
							if(i%2==0)
								System.out.print("# ");
							else
								System.out.print("* ");
						}
						else
						{
							if(i%2==0)
								System.out.print("* ");
							else
								System.out.print("# ");
						}
					}
				}
				System.out.println();
			}
		}
	}
}