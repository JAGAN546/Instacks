import java.util.*;
class Q21
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int s,e,i,c;
        s=sc.nextInt();
        e=sc.nextInt();
        if(s>e)
        {
            c=0;
            for(i=s;i>=e;i--)
            {
                if(c==0)
                {
                    System.out.print(i+"@"+(i-1));
                    c++;
                }
                else
                {
                    System.out.print(","+i+"@"+(i-1));
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
                    System.out.print(i+"@"+(i+1));
                    c++;
                }
                else
                {
                    System.out.print(","+i+"@"+(i+1));
                }
            }
        }
    }
}