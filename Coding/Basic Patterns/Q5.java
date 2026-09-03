import java.util.*;
class Q5
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int i,j,n,m,c=1;
        n=sc.nextInt();
        m=sc.nextInt();
        if(n==0 || m==0)
            System.out.println("Invalid Inputs");
        else
        {
            if(n<0)
                n=-n;
            if(m<0)
                m=-m;
            for(i=1;i<=n;i++)
            {
                for(j=1;j<=m;j++)
                {
                    System.out.print(c+" ");
                    c++;
                }
                System.out.println();
            }
        }
    }
}