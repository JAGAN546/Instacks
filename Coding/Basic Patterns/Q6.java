import java.util.*;
class Q6
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int i,j,n,c=1;
        n=sc.nextInt();
        if(n<=0)
            System.out.println("Invalid Input");
        else
        {
            for(i=1;i<=n;i++)
            {
                for(j=1;j<=n;j++)
                {
                    if(c==1)
                    {
                        System.out.print("1 ");
                        c=0;
                    }
                    else
                    {
                        System.out.print("0 ");
                        c=1;
                    }
                    if(j==n)
                    {
                        if(c==1)
                            c=0;
                        else
                            c=1;
                    }
                }
                System.out.println();
            }
        }
    }
}