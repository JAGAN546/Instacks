import java.util.*;
class Sum
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int s,e,sum=0;
        s=sc.nextInt();
        e=sc.nextInt();
        if(s>e)
            System.out.println("INVALID RANGE");
        else
        {
        for(int i=s;i<=e;i++)
            sum=sum+i;
        System.out.println(sum);
        }
    }
}
