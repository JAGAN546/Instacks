import java.util.*;
class Range
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int s,e,i;
        s=sc.nextInt();
        e=sc.nextInt();
        if(s>e)
            System.out.println("INVALID RANGE");
        for(i=s;i<=e;i++)
        {
            if(i%2==0)
                System.out.print(i+" ");
        }
    }
}
