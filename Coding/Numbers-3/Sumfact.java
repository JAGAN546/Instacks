import java.util.*;
class Sumfact
{
    static void fact(int n)
    {
        int i,s=0,a;
        for(i=0;i<=n;i++)
        {
            a=facts(i);
            s+=a;
            System.out.print(a);
            if(i!=n)
                System.out.print("+");
        }
        System.out.print("="+s);
    }
    static int facts(int n)
    {
        int f=1,i;
        for(i=n;i>=1;i--)
            f=f*i;
        return f;
    }
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<0)
            System.out.println("INvalid INput");
        else
            fact(n);
    }
}