import java.util.Scanner;
class Primerange
{
    static boolean isPrime(int a)
    {
        if(a<=1)
            return false;
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
        //Write your code here
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
                        System.out.print(", "+i);
                }
            }
        }
    }
}
