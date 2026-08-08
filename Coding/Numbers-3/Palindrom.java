import java.util.*;
class Palindrom
{
    static void palin(int s, int e)
    {
        int c=0,i;
        for(i=s;i<=e;i++)
        {
            if(isPalin(i))
            {
                c++;
                System.out.println(i);
            }
        }
        if(c==0)
            System.out.println("No Palindrome Values");
    }
    static boolean isPalin(int n)
    {
        int n1,d,r=0;
        n1=n;
        while(n>0)
        {
            d=n%10;
            r=r*10+d;
            n/=10;
        }
        if(n1==r)
            return true;
        else
            return false;
    }
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int s,e,t;
        s=sc.nextInt();
        e=sc.nextInt();
        if(s<0 || e<0)
            System.out.println("InvaliD InputS");
        else if(s>e)
        {
            t=s;
            s=e;
            e=t;
            palin(s+1,e-1);
        }
        else
            palin(s+1,e-1);
    }
}