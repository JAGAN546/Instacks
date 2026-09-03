import java.util.*;
class Q1
{
    public static void main(String []args)
    {
        //Write your Code Here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,j;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
                System.out.print("* ");
            System.out.println();
        }
    }
}