import java.util.*;
class Q15
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int a,b,i,c=0,d=0;
        a=sc.nextInt();
        b=sc.nextInt();
        if(a<b)
        {
            for(i=a;i<=b;i++)
            {
                if(c==0)
                {
                    System.out.print(i+"*"+(i+1));
                    c++;
                }
                else
                    System.out.print(", "+i+"*"+(i+1));
            }
            System.out.println();
            c=0;
            for(i=a;i<=b;i++)
            {
                if(c==0)
                {
                    System.out.print(i*(i+1));
                    c++;
                }
                else
                    System.out.print(", "+i*(i+1));
            }
        }
        else
        {
            int t;
            t=a;
            a=b;
            b=t;
            for(i=a;i<=b;i++)
            {
                if(d==0)
                {
                    System.out.print(i+"*"+(i+1));
                    d++;
                }
                else
                    System.out.print(", "+i+"*"+(i+1));
            }
            System.out.println();
            d=0;
            for(i=a;i<=b;i++)
            {
                if(d==0)
                {
                    System.out.print(i*(i+1));
                    d++;
                }
                else
                    System.out.print(", "+i*(i+1));
            }
        }
    }
}