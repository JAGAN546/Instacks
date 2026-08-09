import java.util.*;
class Prime
{
    static boolean isPrime(int n)
    {
        int s,i;
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
            if(isPrime(n))
                System.out.println("Prime Number");
            else
                System.out.println("Not a Prime Number");
    }
}
