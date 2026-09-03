import java.util.*;
class Q8
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int i,j,n,k;
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
                    System.out.print("1 ");
                else
                    System.out.print(i+" ");
            }
            System.out.println();
        }
        }
    }
}