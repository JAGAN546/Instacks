import java.util.*;
class Armv
{
    static boolean isArm(int n)
    {
        int t=n,c=0,d,sum=0;
        while(t>0)
        {
            c++;
            t/=10;
        }
        t=n;
        while(t>0)
        {
            d=t%10;
            sum+=(int)Math.pow(d,c);
            t/=10;
        }
        if(sum==n)
            return true;
        return false;
    }
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int s,e,c=0,i,p=1;
        s=sc.nextInt();
        e=sc.nextInt();
        if(s==0 || e==0)
        {
            System.out.println("Invalid Inputs");
            return;
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
            for(i=s+1;i<e;i++)
            {
                if(isArm(i))
                {
                    if(p==1)
                    {
                        System.out.print("Armstrong Numbers between the Given Values is ");
                        p++;
                    }
                    if(c==0)
                        System.out.print(i);
                    else
                        System.out.print(", "+i);
                    c++;
                }
            }
            if(c==0)
                System.out.println("No Armstrong Numbers Between Given Values");
            else
                System.out.print(".");
        }
    }
}
