import java.util.*;
class Primealt
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
        int s,e,i,c=0;
        s=sc.nextInt();
        e=sc.nextInt();
        if(s<=0 || e<=0)
            System.out.println("Invalid Inputs");
        else
        {
            for(i=s;i<=e;i++)
            {
                if(isPrime(i))
                {
                    if(c==0)
                    {
                        System.out.print(i);
                        c++;
                    }
                    else
                    {
                        if(c%2==0)
                            System.out.print(", "+i);
                        c++;
                    }
                }
                
            }
        }
    }
}
