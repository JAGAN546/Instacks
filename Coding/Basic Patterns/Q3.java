import java.util.*;
class Q3
{
    public static void main(String []args)
    {
        //Write Your Code Here
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
                    System.out.print(j+" ");
                }
                System.out.println();
            }
        }
    }
}