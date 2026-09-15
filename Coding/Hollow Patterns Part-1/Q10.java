import java.util.*;
class Q10
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,j,n;
        n=sc.nextInt();
        if(n<=0)
            System.out.println("Invalid Input");
        else
        {
            for(i=1;i<=n;i++)
            {
                for(j=1;j<=i;j++)
                {
                    if(i>1 && j>1 && j<i)
                        System.out.print("  ");
                    else
                        System.out.print("* ");
                }
                System.out.println();
            }
            for(i=n-1;i>=1;i--)
            {
                for(j=1;j<=i;j++)
                {
                    if(i>1 && j>1 && j<i)
                        System.out.print("  ");
                    else
                        System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}