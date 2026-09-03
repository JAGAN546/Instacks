import java.util.*;
class Q7
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int i,j,n;
        n=sc.nextInt();
        if(n<=0)
            System.out.println("Invalid Input");
        else
        {
            for(i=1;i<=n;i++)
            {
                for(j=1;j<=n;j++)
                {
                    if(i==j)
                        System.out.print(i+" ");
                    else    
                        System.out.print("0 ");
                }
                System.out.println();
            }
        }
    }
}