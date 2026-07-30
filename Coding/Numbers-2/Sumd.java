import java.util.*;
class Sumd
{
    static int sumd(int a)
    {
        int s=0,d;
        while(a!=0)
        {
            d=a%10;
            s+=d;
            a/=10;
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
            System.out.println(sumd(n));
    }
}