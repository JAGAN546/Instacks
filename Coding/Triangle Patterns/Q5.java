import java.util.*;
class Q5
{
	public static void main(String[]args)
	{
		//Write your code here.
		Scanner sc=new Scanner(System.in);
		int i,j,n;
		n=sc.nextInt();
		if(n==0)
			System.out.print("Invalid Input");
		else if(n<0)
			System.out.print("Given Input is Negative");
		else
		{
			for(i=1;i<=n;i++)
			{
				int k=1;
				for(j=i;j<n;j++)
					System.out.print(" ");
				for(j=1;j<=i;j++)
				{
					System.out.print(k+" ");
					k=k*(i-j)/j; 
					// System.out.print(j+" ");
				}
				System.out.println();
			}
		}
	}
}