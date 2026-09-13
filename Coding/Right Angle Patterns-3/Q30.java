import java.util.*;
class Q30
{
    public static void main(String []args)
    {
        //Write your code here
        Scanner sc=new Scanner(System.in);
        int i,j,n,c=1;
        //String b="";
        n=sc.nextInt();
        if(n==0)
            System.out.println("Invalid Input");
        else
        {
            if(n<0)
                n=-n;
            for(i=1;i<=n;i++)
            {
               for(j=1;j<=i;j++)
               {
                    System.out.print(c%2);
                    c++;
               }
                System.out.println();
            }
        }
    }
}