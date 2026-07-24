import java.util.Scanner;
class SumP
{
    static boolean isPrime(int a)
    {
        int i,s,c=0;
        s=(int)Math.sqrt(a);
        for(i=2;i<=s;i++)
        {
            if(a%i==0)
                c++;
        }
        if(c==0)
            return true;
        else
            return false;
    }
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int i,s,e,sum=0;
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
                }
            }
            System.out.println(sum);
        }
    }
}