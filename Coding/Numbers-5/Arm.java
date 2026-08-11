import java.util.Scanner;
class Arm
{
    static int Digit(int n)
    {
        int c=0;
        while(n!=0)
        {
            c++;
            n/=10;
        }
        return c;
    }
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<=0)
        {
            System.out.println("Invalid Input");
            return;
        }
        int t=n,sum=0,d,c;
        while(t!=0)
        {
            d=t%10;
            c=Digit(n);
            sum+=Math.pow(d,c);
            t/=10;
        }
        if(sum==n)
            System.out.println(n+" is a Armstrong Number.");
        else
            System.out.println(n+" is Not a Armstrong Number.");
    }
}