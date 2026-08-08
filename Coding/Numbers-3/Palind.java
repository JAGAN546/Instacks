import java.util.*;
class Palind
{
    static void Palin(int n)
    {
        int r=0,d,n1;
        n1=n;
        while(n>0)
        {
            d=n%10;
            r=r*10+d;
            n/=10;
        }
        if(r==n1)
            System.out.println("Given Number is Palindrome");
        else
            System.out.println("Reverse of a Given Number is "+r);
    }
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<0)
            System.out.println("Invalid Input");
        if(n==0)
            System.out.println("Zero");
        if(n>0)
            Palin(n);
    }
}