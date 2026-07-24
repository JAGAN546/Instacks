import java.util.Scanner;
class PrimeFact
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
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==0)
            System.out.println("Invalid Input");
        else
        {
            if(n<0)
                n=-n;
            int i,c=0;
            for(i=2;i<=n;i++)
            {
                if(n%i==0)
                {
                    if(isPrime(i))
                    {
                        System.out.print(i+" ");
                        c++;
                    }
                }
            }
            if(c==0)
                System.out.println("No Prime Factors");
        }
    }
}
