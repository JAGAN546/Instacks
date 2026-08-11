import java.util.Scanner;
class Main
{
    static boolean isArm(int n)
    {
        int t=n,c=0,sum=0,d;
        while(t!=0)
        {
            c++;
            t/=10;
        }
        t=n;
        while(t!=0)
        {
            d=t%10;
            sum+=Math.pow(d,c);
            t/=10;
        }
        if(sum==n)
            return true;
        return false;
    }
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int e=sc.nextInt();
        int i,sum=0,p=0,c=0;
        if(s==0 || e==0)
        {
            System.out.println("Invalid Inputs");
        }
        else
        {
            if(s<0)
                s=-s;
            if(e<0)
                e=-e;
            if(s>e)
            {
                int t=s;
                s=e;
                e=t;
            }
            for(i=s;i<=e;i++)
            {
                if(isArm(i))
                {
                    if(i%2!=0)
                    {
                        if(p==0)
                        {
                            System.out.print("Odd Armstrong Numbers in the Given Range is ");
                            p++;
                        }
                        if(c==0)
                            System.out.print(i);
                        else
                            System.out.print(", "+i);
                        c++;
                    }
                }
            }
            if(c==0)
                System.out.println("No Odd Armstrong Numbers.");
            else
                System.out.println(".");
        }
    }
}