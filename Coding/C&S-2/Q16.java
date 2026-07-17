import java.util.*;
class Q16
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int s,e,i,sum=0;
        s=sc.nextInt();
        e=sc.nextInt();
        if(s>e)
            System.out.println("INVALID RANGE");
        else
        {
            for(i=s+1;i<e;i++)
            {
                if(i%2==0)
                    sum+=i;
            }
            if(sum==0)
            {
                System.out.println("NO NUMBERS");
                return;
            }
            System.out.println(sum);
        }
    }
}