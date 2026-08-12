import java.util.*;
class Armstrong
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n,t,sum=0,c=0,d;
        n=sc.nextInt();
        if(n<=0)
            System.out.println("Invalid Input");
        else
        {
            t=n;
            while(t>0)
            {
                c++;
                t/=10;
            }
            t=n;
            while(t>0)
            {
                d=t%10;
                sum+=Math.pow(d,c);
                t/=10;
            }
            if(sum==n)
                System.out.println("Armstrong Number");
            else
                System.out.println("Not a Armstrong Number");
        }
    }
}
