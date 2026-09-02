import java.util.*;
class Hextooct
{
    static long hex(String s)
    {
        long sum=0,c=0,n2=0;
        int start=0;
        if(s.charAt(0)=='-')
            start=1;
        for(int i=s.length()-1;i>=start;i--)
        {
            long n1=(long)Math.pow(16,c++);
            char ch=s.charAt(i);
            if(ch>='0' && ch<='9')
                n2=(ch-'0');
            else if(ch>='A' && ch<='Z')
                n2=(ch-55);
            else if(ch>='a' && ch<='z')
                n2=(ch-87);
            sum+=n1*n2;
        }
        return sum;
    }
    static String oct(long n)
    {
        if(n==0)
            return "0";
        String sum="";
        while(n>0)
        {
            long n2=n%8;
            sum=n2+sum;
            n/=8;
        }
        return sum;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int start=0;
        boolean sign=false;
        long n=hex(s);
        if(s.charAt(0)=='-')
        {
            start=1;
            sign=true;
        }
        for(int i=s.length()-1;i>=start;i--)
        {
            char ch=s.charAt(i);
            if((ch<'0' || ch>'9')&&(ch<'a'||ch>'f')&&(ch<'A'||ch>'F'))
            {
                System.out.println("InvaliD Input");
                return;
            }
        }
        if(sign)
            System.out.println(s+" -> "+oct(n));
        else
            System.out.println(oct(n));
    }
}