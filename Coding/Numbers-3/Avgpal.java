import java.util.*;
class Avgpal
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=0, d=0;
        if(a!=0 && b!=0)
        {
            a=Math.abs(a);
            b=Math.abs(b);
            if(a>b)
                System.out.print("Given Inputs are Swapped");
            else
            {
                if(a>b)
                    a=a+b-(b=a);
                for(int i=a;i<=b;i++)
                {
                    int t=i;
                    int rev=0;
                    while(t>0)
                    {
                        int r=t%10;
                        rev=rev*10+r;
                        t/=10;
                    }
                    if(rev==i)
                    {
                        sum+=i;
                        d++;
                    }
                }
                if(d==0)
                    System.out.print("No Palindrome Values");
                else
                    System.out.printf("%.2f", (float)sum/d);
            }
        }
        else
        {
            System.out.print("INVALID Inputs");
        }
    }
}