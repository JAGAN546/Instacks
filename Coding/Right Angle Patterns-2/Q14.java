import java.util.*;
class Q14
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
                for(j=1;j<=i;j++)
                {
                    System.out.print(c+" ");
                    c+=2;
                }
                System.out.println();
            }
        }
    }
}