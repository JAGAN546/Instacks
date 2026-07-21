import java.util.Scanner;
class Q25
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int s,e,c,i;
        s=sc.nextInt();
        e=sc.nextInt();
        if(s>e)
        {
            c=0;
            for(i=s;i>=e;i--)
            {
                if(c==0)
                {
                    System.out.print("5*"+i);
                    c++;
                }
                else
                {
                    if(i<0)
                        System.out.print(", 5*("+i+")");
                    else
                        System.out.print(", 5*"+i);
                }
            }
        }
        else
        {
            c=0;
            for(i=s;i<=e;i++)
            {
                if(c==0)
                {
                    if(i<0)
                    {
                        System.out.print("5*("+i+")");
                        c++;
                    }
                    else
                    {
                        System.out.print("5*"+i);
                        c++;
                    }
                }
                else
                {
                    if(i<0)
                        System.out.print(", 5*("+i+")");
                    else
                        System.out.print(", 5*"+i);
                }
            }
        }
    }
}