import java.util.*;
class Q25
{
    public static void main(String []args)
    {
        //Write your code here
        Scanner sc=new Scanner(System.in);
        int i,j,n;
        n=sc.nextInt();
        if(n<=0)
            System.out.println("Invalid Input");
        else
        {
            for(i=1;i<=n;i++)
            {
                int p=i;
                int d=n-1;
                for(j=1;j<=i;j++)
                {
                    System.out.print(p+" ");
                    p=p+d;
                    d--;
                }
                System.out.println();
            }
        }
    }
}