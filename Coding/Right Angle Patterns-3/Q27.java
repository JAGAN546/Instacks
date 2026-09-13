import java.util.*;
class Q27
{
    static boolean isPrime(int n)
    {
        if(n==2)
            return true;
        else
        {
            int i,s;
            s=(int)Math.sqrt(n);
            for(i=2;i<=s;i++)
            {
                if(n%i==0)
                    return false;
            }
            return true;
        }
    }
    public static void main(String []args)
    {
        //Write your code here
        Scanner sc=new Scanner(System.in);
        int i,j,n,c,d=1;
        n=sc.nextInt();
        if(n==0)
            System.out.println("Invalid Input");
        else
        {
            if(n<0)
                n=-n;
            for(i=1;i<=n;i++)
            {
                c=2;
                while(d<=i)
                {
                    if(isPrime(c))
                    {
                        System.out.print(c+" ");
                        c++;
                        d++;
                    }
                    else
                        c++;
                }
                d=1;
                System.out.println();
            }
        }
    }
}