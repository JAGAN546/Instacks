import java.util.*;
class Q12
{
    public static void main(String []args)
    {
        //Write Your Code Here
        Scanner sc=new Scanner(System.in);
        int i,j,n,c;
        n=sc.nextInt();
        if(n<=0)
            System.out.println("Invalid Input");
        else
        {
            for(i=n;i>=1;i--)
            {
                c=n;
                for(j=i;j>=1;j--)
                {
                    System.out.print(c+" ");
                    c--;
                }
                System.out.println();
            }
        }
    }
}