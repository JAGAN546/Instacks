import java.util.*;
class Q29
{
    public static void main(String []args)
    {
        //Write your code here
        Scanner sc=new Scanner(System.in);
        int i,j,n,m;
        n=sc.nextInt();
        m=sc.nextInt();
        if(n<=0 && m<0)
            System.out.println("Invalid Inputs");
        else if(n<=0)
            System.out.println("Invalid Row Value");
        else if(m<0)
            System.out.println("Invalid Starting Value");
        else
        {
            for(i=1;i<=n;i++)
            {
                for(j=1;j<=i;j++)
                {
                    System.out.print(m);
                }
                m++;
                System.out.println();
            }
        }
    }
}