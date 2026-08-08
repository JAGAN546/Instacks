import java.util.*;
class AltPal
{
    static void palin(int s, int e)
    {
        int i,c=0;
        for(i=s;i<=e;i++)
        {
            if(isPalin(i))
            {
                if(c%2==0)
                {
                    if(c==0)
                        System.out.print(i);
                    else
                        System.out.print(", "+i);
                }
                c++;
            }
        }
        if(c==0)
            System.out.println("No Palindrome Values");
        else
            System.out.print(".");
    }
    static boolean isPalin(int n)
    {
        int r=0,d,n1;
        n1=n;
        while(n!=0)
        {
            d=n%10;
            r=r*10+d;
            n/=10;
        }
        if(r==n1)
            return true;
        else
            return false;
    }
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int s,e;
        s=sc.nextInt();
        e=sc.nextInt();
        if(s<0 || e<0)
            System.out.println("InvAlid InPUts");
        else
            palin(s,e);
    }
}