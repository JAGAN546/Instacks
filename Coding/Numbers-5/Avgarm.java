import java.util.*;
class Avgarm
{
    static boolean isArm(int n)
    {
        int t=n,sum=0,c=0,d;
        while(t!=0)
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
        Scanner sc=new Scanner(System.in);
        int s,c=0,i,e,t,p=0,d=1,sum=0;
        s=sc.nextInt();
        e=sc.nextInt();
        if(s==0 || e==0)
        {
            System.out.println("Invalid Inputs.");
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
                        System.out.print("Average of Alternative Armstrong Numbers in the Given Range is ( ");
                        p++;
                    }
                    if(c%2==0)
                    {
                        if(c==0)
                        {
                            System.out.print(i);
                        }
                        else
                        {
                            System.out.print(" + "+i);
                            d++;
                        }
                        sum+=i;
                    }
                    c++;
                }
            }
            if(c==0)
                System.out.println("No Armstrong Numbers in a Given Range");
            else
            {
                System.out.print(" ) / "+d+" = ");
                System.out.printf("%.2f",(float)sum/d);
            }
        }
    }
}