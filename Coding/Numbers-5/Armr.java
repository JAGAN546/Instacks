import java.util.*;
class Main
{
    static boolean isArm(int n)
    {
        int d,sum=0,c=0,t=n;
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
            return true;
        return false;
    }
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int s,e,c=0,t,p=0,i;
        s=sc.nextInt();
        e=sc.nextInt();
        if(s<=0 || e<=0)
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
                t=s;
                s=e;
                e=t;
            }
            for(i=s;i<=e;i++)
            {
                if(isArm(i))
                {
                    if(p==0)
                    {
                        System.out.print("Armstrong Numbers in the Given Range is ");
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
                System.out.println("No Armstrong Numbers");
            else
                System.out.print(".");
        }
    }
}
