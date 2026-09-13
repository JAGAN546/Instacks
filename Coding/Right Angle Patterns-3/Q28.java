import java.util.*;
class Q28
{
    public static void main(String []args)
    {
        //Write your code here
        Scanner sc=new Scanner(System.in);
        int i,j,n,c=1;
        n=sc.nextInt();
        if(n==0)
            System.out.println("Invalid Input");
        else
        {
            if(n<0)
                n=-n;
            for(i=1;i<=n;i++)
            {
                if(i%2==1)
                {
                    for(j=1;j<=i;j++)
                    {
                        System.out.print(c+"");
                        if(j!=i)
                            System.out.print("*");
                        c++;
                    }
                    c=c+i+1;
                }
                else
                {
                    c--;
                    for(j=1;j<=i;j++)
                    {
                        System.out.print(c+"");
                        if(j!=i)
                            System.out.print("*");
                        c--;
                    }
                    c=c+i+1;
                }
                System.out.println();
            }
        }
    }
}