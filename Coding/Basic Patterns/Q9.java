import java.util.*;
class Q9
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int i,j,n,k;
        n=sc.nextInt();
        if(n==0)
            System.out.println("InvaliD Input");
        else
        {
            if(n<0)
                n=-n;
            for(i=1;i<=n;i++)
            {
                for(j=1;j<=n;j++)
                {
                    if(j<=i)
                        System.out.print(n-j+1);
                    else
                        System.out.print(n-i+1);
                }
                System.out.println();
            }
        }
    }
}