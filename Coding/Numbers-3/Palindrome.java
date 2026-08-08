import java.util.*;
class Palindrome
{
    static boolean isPalin(int n)
    {
        int d,r=0,n1;
        n1=n;
        while(n>0)
        {
            d=n%10;
            r=r*10+d;
            n/=10;
        }
        if(n1==r)
            return true;
        else
            return false;
    }
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<=0)
            System.out.println("InvAlid Input");
        else
        {
            if(isPalin(n))
                System.out.println("Palindrome");
            else
                System.out.println("Not a Palindrome");
        }
    }
}