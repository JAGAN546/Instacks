import java.util.*;
class Q3
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
            for(i=n;i>=1;i--)
            {
                for(j=i;j>=1;j--)
                    System.out.print("*");
                System.out.println();
            }
        }
    }
}