import java.util.*;
class Q11
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int i,j,n,m,c=1;
        n=sc.nextInt();
        m=sc.nextInt();
        if(n<=0 && m<=0)
            System.out.println("Invalid Row and Column Values");
        else if(n<=0)
            System.out.println("Invalid Row Value");
        else if(m<=0)
            System.out.println("Invalid Column Value");
        else
        {
            for(i=1;i<=n;i++)
            {
                for(j=1;j<=m;j++)
                {
                    if(j<m)
                        System.out.print(c+"*");
                    if(j==m)
                        System.out.print(c);
                    c++;
                }
                System.out.println();
            }
        }
    }
}