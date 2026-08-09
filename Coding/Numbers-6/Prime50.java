import java.util.*;
class Prime50
{
    static boolean isPrime(int n)
    {
        int i,s;
        s=(int)Math.sqrt(n);
        for(i=2;i<=s;i++)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<=0)
            System.out.println("Invalid Input");
        else
        {
            int c=0;
            for(int i=2;;i++)
            {
                if(isPrime(i))
                {
                    if(c==0)
                        System.out.print(i);
                    else
                        System.out.print(", "+i);
                    c++;
                    if(c==n)
                        break;
                }
            }
        }
    }
}
