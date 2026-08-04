import java.util.Scanner;
class Fibo
{
    static void fibo(int s,int e)
    {
        int i,a=0,b=1,c,d=0;
        for(i=s;i<=e;i++)
        {
            if(a>=s && a<=e)
            {
                d++;
                System.out.print(a+" ");
            }
            c=a+b;
            a=b;
            b=c;
        }
        if(d==0)
            System.out.println("No Fibonacci Series Values");
    }
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int e=sc.nextInt();
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
