import java.util.*;
class Q15
{
    public static void main(String []args)
    {
        //Write Your Code Here
        Scanner sc=new Scanner(System.in);
        int i,j,n,c=2;
        n=sc.nextInt();
        if(n==0)
            System.out.print("Invalid Input");
        else
        {
            if(n<=0)
                n=-n;
            for(i=1;i<=n;i++)
            {
                for(j=1;j<=i;j++)
                {
                    System.out.print(c+" ");
                    if(j==i)
                        c++;
                    else
                        c+=2;
                }
                System.out.println();
            }
        }
    }
}