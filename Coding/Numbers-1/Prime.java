import java.util.Scanner;
class Prime
{
    static boolean isPrime(int a)
    {
        int i,s;
        s=(int)Math.sqrt(a);
        for(i=2;i<=s;i++)
        {
            if(a%i==0)
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[])
    {
        //Write your code here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,s;
        if(n<=0)
            System.out.println("Invalid Input");
        else
        {
            if(isPrime(n))
                System.out.println("Prime Number");
            else
                System.out.println("Not a Prime Number");
        }
    }
}