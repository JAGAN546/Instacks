import java.util.*;
class Q16
{
    public static void main(String []args)
    {
        //Write Your Code Here
        Scanner sc=new Scanner(System.in);
        int i,j,n,m;
        n=sc.nextInt();
        m=sc.nextInt();
        if(n<=0)
        {
            System.out.println("Invalid Input");
            return;
        }
        else
        {
            for(i=n;i>=1;i--)
            {
                for(j=i;j>=1;j--)
                {
                    System.out.print(m+" ");
                    m--;
                }
                System.out.println();
            }
        }
    }
}