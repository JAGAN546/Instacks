import java.util.*;
class Highest
{
    static int high(int n)
    {
        int max=0,d;
        while(n>0)
        {
            d=n%10;
            if(max<d)
                max=d;
            n/=10;
        }
        return max;
    }
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<=0)
            System.out.println("Invalid Input.");
        else
            System.out.println("Highest Digit in a Given Number is "+high(n)+".");
    }
}