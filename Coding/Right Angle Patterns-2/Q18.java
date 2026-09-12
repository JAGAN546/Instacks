import java.util.*;
class Q18
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int i,j,n,m,s;
        n=sc.nextInt();
        m=sc.nextInt();
        if(n<=0 && (m%2==0))
            System.out.print("Invalid Inputs");
        else if(n<=0)
            System.out.println("Invalid Row Value");
        else if(m%2==0)
        {
            //m=-m;
            //if(m%2==0)
                System.out.println("Invalid Starting Value");
        }
        else
        {
            for(i=1;i<=n;i++)
            {
                s=0;
                for(j=1;j<=i;j++)
                {
                    System.out.print(m+" ");
                    s=s+m;
                    m+=2;
                }
                System.out.print("@ "+s+" - ");
                if(s%2==0)
                    System.out.print("Even");
                else
                    System.out.print("Odd");
                System.out.println();
            }
        }

    }
}