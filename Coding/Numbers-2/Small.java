import java.util.*;
class Small
{
    static int smalld(int n)
    {
        int min=n%10;
        int d;
        while(n>0)
        {
            d=n%10;
            if(min>d)
                min=d;
            n/=10;
        }
        return min;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<=0)
            System.out.println("Invalid Input.");
        else
            System.out.println("Smallest Digit in a Given Number is "+smalld(n)+".");
    }
}