import java.util.*;
class Q24
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,n,c=0;
        n=sc.nextInt();
        if(n<=0)
            System.out.print("Invalid Input");
        else
        {
            for(i=1;i<=n;i++)
            {
                if(c==0)
                {
                    System.out.print("5");
                    c++;
                }
                else
                {
                    if(c%2!=0)
                    {
                        System.out.print(", 10");
                        c++;
                    }
                    else
                    {
                        System.out.print(", 5");
                        c++;
                    }
                }
            }
        }
    }
}
