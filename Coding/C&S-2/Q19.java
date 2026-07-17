import java.util.*;
class Q19
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
            for(i=s;i<=e;i++)
            {
                sum=sum+(i*i);
            }
            System.out.println(sum);
        }
    }
}