import java.util.*;
class Q4
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int i,j,n;
        n=sc.nextInt();
        if(n<=0)
            System.out.println("InValid InPut");
        else
        {
            for(i=1;i<=n;i++)
            {
                for(j=1;j<=n;j++)
                {
                    System.out.print(i+" ");
                }
                System.out.println();
            }
        }    
    }
}