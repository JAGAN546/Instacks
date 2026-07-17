import java.util.*;
class Q13
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int s,e,i,c=0;
        s=sc.nextInt();
        e=sc.nextInt();
        if(s>e)
            System.out.println("INVALID INPUTS");
        else
        {
            if(s%2==0)
            {
                for(i=s;i<=e;i+=2)
                {
                    System.out.print(i+" ");
                    c++;
                    i+=2;
                }
            }
            else
            {
                c=0;
                for(i=s;i<=e;i++)
                {
                    if(i%2==0)
                    {
                        if(c%2==0)
                            System.out.print(i+" ");
                        c++;
                    }
                }
            }
            if(c==0)
                System.out.println("NO NUMBERS");
        }
    }
}
