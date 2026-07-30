import java.util.*;
class Reverse
{
    static int reverse(int a)
    {
        int d,r=0;
        while(a!=0)
        {
            d=a%10;
            r=r*10+d;
            a/=10;
        }
        return r;
    }
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<=0)
            System.out.println("InValid Input");
        else
            System.out.println(reverse(n));
    }
}