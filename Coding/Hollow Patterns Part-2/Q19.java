import java.util.*;
class Q19
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,j,a,n;
        n=sc.nextInt();
        if(n<=0)
            System.out.println("Invalid Input");
        else 
        {
                for(i=1;i<=n;i++)
                {
                    for(j=1;j<=n;j++)
                    {
                        if(n%2==1)
                        {
                            a=n/2+1;
                            if(i==a || j==a)
                                System.out.print("* ");
                            else    
                                System.out.print("  ");
                        }
                        else
                        {
                            a=n/2;
                            if(i==a || i==a+1 || j==a || j==a+1)
                                System.out.print("* ");
                            else
                                System.out.print("  ");
                        }
                    }
                    System.out.println();
                }
        }
    }
}