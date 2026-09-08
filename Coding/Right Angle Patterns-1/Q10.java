import java.util.*;
class Q10
{
    public static void main(String []args)
    {
        //Write Your Code Here
        Scanner sc=new Scanner(System.in);
        int i,j,n,c=65;
        n=sc.nextInt();
        if(n==0)
            System.out.println("Invalid Input");
        else
        {
            if(n<0)
                n=-n;
            if(n>6)
                System.out.println("Range Exceeded");
            else
            {
                for(i=1;i<=n;i++)
                {
                    for(j=1;j<=i;j++)
                    {
                        System.out.print((char)c+" ");
                        c++;
                    }
                    System.out.println();
                }
            }
        }
    }
}