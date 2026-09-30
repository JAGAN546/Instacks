import java.util.*;
class Q8
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,j,n,c;
        n=sc.nextInt();
        if(n<=0)
            System.out.println("Invalid Input.");
        else
        {
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(i*j+" ");
            }
            System.out.println();
        }
        c=n+1;
        for(i=n-1;i>=1;i--)
        {
            for(j=1;j<=i;j++)
                System.out.print(c*j+" ");
            c++;
            System.out.println();
        }
        }
    }
}