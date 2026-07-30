import java.util.*;
class Evensum
{
    static int evensum(int n)
    {
        int d,s=0;
        while(n!=0)
        {
            d=n%10;
            if(d%2==0)
                s+=d;
            n/=10;
        }
        return s;
    }
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<=0)
            System.out.println("Invalid Input");
        else
            System.out.println(evensum(n));
    }
}