import java.util.*;
class Sumpr
{
    static void Prime(int a, int b)
    {
        int i,s=0,c=0;
        for(i=a+1;i<b;i++)
        {
            if(isPrime(i))
            {
                if(c%2==0)
                    s+=i;
                c++;
            }
        }
        if(c==0)
            System.out.println("No Prime Numbers");
        else
            System.out.println(s);
    }
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
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int s,e;
        s=sc.nextInt();
        e=sc.nextInt();
        if(s<=0 || e<=0)
            System.out.println("Invalid Inputs");
        else
            Prime(s,e);
    }
}