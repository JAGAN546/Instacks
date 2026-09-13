import java.util.*;
class Q23
{
    public static void main(String []args)
    {
        //Write your code here
        Scanner sc=new Scanner(System.in);
        int i,j,n,c=1;
        n=sc.nextInt();
        if(n<=0)
            System.out.println("Invalid Input");
        else
        {
            for(i=1;i<=n;i++)
            {
                for(j=1;j<=n;j++)
                {
                    if(j<=n-i)
                        System.out.print("   ");
                    else
                    {
                        if(c<=9)
                            System.out.print("0"+c+" ");
                        else
                            System.out.print(c+" ");
                        c++;
                    }
                }
                System.out.println();
            }
        }
    }
}