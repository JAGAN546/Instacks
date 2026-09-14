import java.util.*;
class Q10
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,j,n,c;
        n=sc.nextInt();
        if(n<=0)
            System.out.print("Invalid Input");
        else
        {
            for(i=1;i<=n;i++)
            {
                c=1;
                for(j=1;j<=n;j++)
                {
                    if(j<=n-i)
                        System.out.print(" ");
                    else
                    {
                        System.out.print(c+" ");
                        c++;
                    }
                }
                System.out.println();
            }
        }
    }
}