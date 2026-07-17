import java.util.*;
class Q12
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int s,e,i,c=0;
        s=sc.nextInt();
        e=sc.nextInt();
        if(s>e)
            System.out.println("INVALID RANGE");
        else
        {
            for(i=s;i<=e;i++)
            {
                if(i%2==0)
                    c++;
                // else
                    // System.out.println("NO NUMBERS");
            }
            if(c==0)
                System.out.println("NO NUMBERS");
            else
                System.out.println(c);
        }
    }
}