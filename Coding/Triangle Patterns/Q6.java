import java.util.*;
class Q6
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,j,n;
        n=sc.nextInt();
        if(n==0)
            System.out.println("Oh! I got Zero(0)");
        else
        {
            if(n<0)
                n=-n;
            for(i=1;i<=n;i++)
            {
                for(j=1;j<=n;j++)
                {
                    if(j<=n-i)
                        System.out.print(" ");
                    else
                        System.out.print(n-j+1);
                }
                for(j=1;j<=n-1;j++)
                {
                    if(j<=i-1)
                        System.out.print(j+1);
                }
                System.out.println();
            }
        }
    }
}