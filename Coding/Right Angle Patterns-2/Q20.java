import java.util.*;
class Q20
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
                for(j=1;j<=i;j++)
                {
                    if(i%2==0)
                        System.out.print("# ");
                    else
                        System.out.print("@ ");
                }
                System.out.println();
            }
        }
    }
}