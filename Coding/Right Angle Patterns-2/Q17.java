import java.util.*;
class Q17
{
    public static void main(String []args)
    {
        //Write Your Code Here
        Scanner sc=new Scanner(System.in);
        int i,j,s,n,m;
        n=sc.nextInt();
        m=sc.nextInt();
        if(n<=0 && m<=0)
            System.out.println("Invalid Inputs");
        else if(m<=0)
            System.out.println("Invalid Starting Value");
        else if(n<=0)
            System.out.println("Invalid Row Input");
        else
            for(i=1;i<=n;i++)
            {
                s=0;
                for(j=1;j<=i;j++)
                {
                    System.out.print(m+" ");
                    s=s+m;
                    m++;
                }
                System.out.print("- "+s);
                System.out.println();
            }
    }
}