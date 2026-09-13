import java.util.*;
class Q22
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
                for(j=1;j<=n;j++)
                {
                    if(j<=9)
                    {
                        if(j<=i-1)
                            System.out.print("  ");
                        else
                            System.out.print(j+" ");
                    }
                    else
                    {
                        if(j<=i-1)
                            System.out.print("   ");
                        else
                            System.out.print(j+" ");   
                    }
                }
                System.out.println();
            }
        }
    }
}