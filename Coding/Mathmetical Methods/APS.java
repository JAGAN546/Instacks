import java.util.*;
class APS
{
    static void ap(int a,int d,int n)
    {
        int i,s=0;
        for(i=0;i<n;i++)
        {
            s=s+a+i*d;
            System.out.print(a+i*d);
            if(i+1!=n)
                System.out.print(" + ");
        }
        System.out.println(" = "+s+".");
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,d,n;
        a=sc.nextInt();
        d=sc.nextInt();
        n=sc.nextInt();
        if(n<=0)
            System.out.println("Invalid input.");
        else
            ap(a,d,n);
    }
}