import java.util.*;
class Q26
{
    public static void main(String []args)
    {
        //Write your code here
        Scanner sc=new Scanner(System.in);
        int i,j,n,a,b,c=0;
        n=sc.nextInt();
        if(n==0)
            System.out.println("Invalid Input");
        else
        {
            if(n<0)
                n=-n;
            for(i=1;i<=n;i++)
            {
                a=0;
                b=1;
                for(j=1;j<=i;j++)
                {
                    c=a+b;
                    System.out.print(c+" ");
                    a=b;
                    b=c;
                }
                System.out.println();
            }
        }
    }
}