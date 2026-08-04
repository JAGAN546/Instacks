import java.util.*;
class Altavgf
{
    static void fibo(int s, int e)
    {
        int a=0,b=1,c=0,d=0,sum=0,cd=0;
        while(a<=e)
        {
            if(a>=s)
            {
                if(d%2==0)
                {
                    sum+=a;
                    c++;
                }
                d++;
            }
            cd=a+b;
            a=b;
            b=cd;
        }
        if(c==0)
            System.out.println("No Fibonacci Series Values");
        else
            System.out.printf("%.2f",(float)sum/c);
    }
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int s,e;
        s=sc.nextInt();
        e=sc.nextInt();
        if(s<0 || e<0)
            System.out.println("Invalid Inputs");
        else
        {
            if(s>e)
            {
                int t=s;
                s=e;
                e=t;
            }
            fibo(s,e);
        }
    }
}
