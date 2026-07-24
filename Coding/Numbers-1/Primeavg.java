import java.util.*;
class Main
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
        int s,e,i,sum=0,c=0;
        float avg;
        s=sc.nextInt();
        e=sc.nextInt();
        if(s<=0 || e<=0)
            System.out.println("Invalid Inputs");
        else
        {
            for(i=s+1;i<e;i++)
            {
                if(isPrime(i))
                {
                    sum+=i;
                    c++;
                }
            }
            avg=(float)sum/c;
            System.out.printf("%.3f",avg);
        }
    }
}
