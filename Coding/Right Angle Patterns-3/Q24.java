import java.util.*;
class Q24
{
    public static void main(String []args)
    {
        //Write your code here
        Scanner sc=new Scanner(System.in);
        int i,j,n;
        n=sc.nextInt();
        if(n<=0)
            System.out.println("Invalid Input");
        else if(n>26)
            System.out.println("Invalid Row Value");
        else
        {
            for(i=1;i<=n;i++)
            {
                int c=n+64;
                for(j=1;j<=n;j++)
                {
                    if(j<=n-i)
                        System.out.print("  ");
                    else
                    {
                        System.out.print((char)c+" ");
                        c--;
                    }
                }
                System.out.println();
            }
        }
    }
}