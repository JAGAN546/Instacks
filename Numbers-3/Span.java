import java.util.*;
class Span
{
    static void highspan(int n)
    {
        int max=0,min=n%10,d;
        while(n>0)
        {
            d=n%10;
            if(max<d)
                max=d;
            if(min>d)
                min=d;
            n/=10;
        }
        System.out.println("Lowest Digit in a Given Number is "+min+".");
        System.out.println("Highest Digit in a Given Number is "+max+".");
        System.out.println("Highest Span in a Given Number is "+(max-min)+".");
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<=0)
            System.out.println("Invalid Input.");
        else
            highspan(n);
    }
}