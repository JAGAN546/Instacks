import java.util.*;
class Alprime
{
    static boolean isPrime(int a)
    {
        int i,s;
        s=(int)Math.sqrt(a);
        for(i=2;i<=s;i++)
        {
            if(a%i==0)
                return false;
        }
        return true;
    }
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int s,e,i,sum=0,c=0,d=0,t;
        float avg;
        s=sc.nextInt();
        e=sc.nextInt();
        if(s<=0 || e<=0)
            System.out.println("Invalid Inputs");
        else if(s<e)
        {
            for(i=s+1;i<e;i++)
            {
                if(isPrime(i))
                {
                    if(c%2==0)
                    {
                        sum+=i;
                        d++;
                    }
                    c++;
                }
            }
            if(c==0)
                System.out.println("No Prime Numbers");
            else
            {
            avg=(float)sum/d;
            System.out.printf("%.3f",avg);
            }
        }
        else
        {
            t=s;
            s=e;
            e=t;
            for(i=s+1;i<e;i++)
            {
                if(isPrime(i))
                {
                    if(c%2==0)
                    {
                        sum+=i;
                        d++;
                    }
                    c++;
                }
            }
            if(c==0)
                System.out.println("No Prime Numbers");
            else
            {
                avg=(float)sum/d;
                System.out.printf("%.3f",avg);
            }
        }
    }
}