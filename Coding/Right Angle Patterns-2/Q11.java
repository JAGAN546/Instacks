import java.util.*;
class Q11
{
    public static void main(String []args)
    {
        //Write Your Code Here
        Scanner sc=new Scanner(System.in);
        int i,j,n,c=100;
        n=sc.nextInt();
        if(n<=0)
            System.out.println("Invalid Input");
        else
        {
            for(i=1;i<=n;i++)
            {
                for(j=1;j<=i;j++)
                {
                    System.out.print(c+" ");
                    c+=100;
                }
                System.out.println();
            }
        }
    }
}