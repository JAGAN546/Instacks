import java.util.*;
class SAP
{
    static void sumPalin(int s, int e)
    {
        int i,c=0,sum=0;
        for(i=s+1;i<e;i++)
        {
            if(isPalin(i))
            {
                if(c%2==0)
                {
                    sum+=i;
                    if(c==0)
                    {
                        System.out.print("Sum of Alternative Palindrome Numbers between the "+s+" and "+e+" is ");
                        System.out.print(i);
                    }
                    else
                        System.out.print(" + "+i);
                }
                c++;
            }
        }
        if(c==0)
            System.out.println("No Palindrome Values");
        else
            System.out.print(" = "+sum+".");
    }
    static boolean isPalin(int n)
    {
        int r=0,d,n1;
        n1=n;
        while(n>0)
        {
            d=n%10;
            r=r*10+d;
            n/=10;
        }
        if(r==n1)
            return true;
        else
            return false;
    }
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int e=sc.nextInt();
        if(s==0 || e==0){
            
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
            sumPalin(s,e);
        }
    }
}