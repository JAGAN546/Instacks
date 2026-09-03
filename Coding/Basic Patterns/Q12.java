import java.util.*;
class Q12
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int i,j,n,c=1;
        n=sc.nextInt();
        if(n<=0)
            System.out.println("Given Value is Invalid");
        else
        {
            for(i=1;i<=n;i++)
            {
                for(j=1;j<=n;j++)
                {
                    if(c%4==0)
                        System.out.print("* ");
                    else
                    {
                        System.out.print(c+" ");
                    }
                    c++;
                }
                System.out.println();
            }
        }
    }
}