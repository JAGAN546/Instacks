import java.util.*;
class Q26
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int s,e,i,c=0;
        s=sc.nextInt();
        e=sc.nextInt();
        if(s>e)
        {
            c=0;
            for(i=s;i>=e;i--)
            {
                if(c==0)
                {
                    System.out.print(i*5);
                    c++;
                }
                else
                {
                    if(i<0)
                    {
                        System.out.print(", ("+(i*5)+")");
                    }
                    else
                        System.out.print(", "+(i*5));
                }
            }
        }
        else
        {
            c=0;
            for(i=s;i<=e;i++)
            {
                if(i<0)
                {
                    if(c==0)
                    {
                        System.out.print("("+(i*5)+")");
                        c++;
                    }
                    else
                    {
                        System.out.print(", ("+(i*5)+")");
                    }
                }
                else
                {
                    if(c==0)
                    {
                        System.out.print((i*5));
                        c++;
                    }
                    else
                        System.out.print(", "+(i*5));
                }
            }
        }
    }
}