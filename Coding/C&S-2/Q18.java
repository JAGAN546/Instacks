import java.util.*;
class Q18
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int s,e,i,c=0,sum=0;
        float avg;
        s=sc.nextInt();
        e=sc.nextInt();
        if(s>e)
            System.out.println("INVALID RANGE");
        else
        {
            for(i=s;i<=e;i++)
            {
                if(i%2==0)
                {
                    sum=sum+i;
                    c++;
                }
            }
            avg=sum/c;
            System.out.println(avg);
        }
    }
}
