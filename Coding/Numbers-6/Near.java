import java.util.*;
class Near
{
    static boolean isPrime(int n)
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
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,i,p1=0,p2=0,a,b;
        n=sc.nextInt();
        if(n<=0)
        {
            System.out.println("InValid Input");
            return;
        }
        for(i=n+1;;i++)
        {
            if(isPrime(i))
            {
                p1=i;
                break;
            }
        }
        for(i=n-1;;i--)
        {
            if(isPrime(i))
            {
                p2=i;
                break;
            }
        }
        a=Math.abs((p1-n));
        b=Math.abs((p2-n));
        if(a<b)
            System.out.println(p1);
        if(a==b)
        {
            System.out.println(p2);
            System.out.println(p1);
        }
        if(a>b)
            System.out.println(p2);
    }
}
