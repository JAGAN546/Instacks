import java.util.*;
class Q9
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,j,n,m;
        n=sc.nextInt();
        m=sc.nextInt();
        if(n<=0 && m<=0)
            System.out.println("Invalid Inputs");
        else if(n<=0)
            System.out.println("Given Row is Invalid.");
        else if(m<=0)
            System.out.println("Invalid STarTing value.");
        else if(m<2 || m>10)
            System.out.print("Given Starting is Invalid");
        else
        {
            for(i=1;i<=n;i++)
            {
                for(j=1;j<=i;j++)
                {
                    System.out.print(m+" ");
                }
                m++;
                System.out.println();
            }
            m--;
            for(i=n;i>=1;i--)
            {
                for(j=i;j>=1;j--)
                {
                    System.out.print(m+" ");
                }
                m--;
                System.out.println();
            }
        }
    }
}