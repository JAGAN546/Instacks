import java.util.*;
class Q19
{
    public static void main(String []args)
    {
        //Write your code here
        Scanner sc=new Scanner(System.in);
        int i,j,n;
        n=sc.nextInt();
        if(n<=0)
            System.out.println("Invalid Input");
        else
        {
            for(i=1;i<=n;i++)
            {
                if(i%2==1)
                {
                    for(j=1;j<=n-i+1;j++)
                        System.out.print(j+" ");
                }
                else
                {
                    for(j=n-i+1;j>=1;j--)
                        System.out.print(j+" ");
                }
                System.out.println();
            }
        }
    }
}