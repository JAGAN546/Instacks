import java.util.*;
class Main
{
    static boolean isArm(int n)
    {
        int c=0,d,sum=0,t=n;
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
        int s,e;
        s=sc.nextInt();
        e=sc.nextInt();
        if(s==0 || e==0)
            System.out.println("Invalid Inputs");
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
            int i,c=0,sum=0,p=0;
            for(i=s+1;i<e;i++)
            {
                if(isArm(i))
                {
                    if(p==0)
                    {
                        System.out.print("Alternative Armstrong Numbers between the Given Values is ");
                        p++;
                    }
                    if(c%2==0)
                    {
                        if(c==0)
                            System.out.print(i);
                        else
                            System.out.print(", "+i);
                    }
                    c++;
                }
            }
            if(c==0)
                System.out.print("No Armstrong Numbers Between Given Values.");
            else
                System.out.print(".");
        }
    }
}