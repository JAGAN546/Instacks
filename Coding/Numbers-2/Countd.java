import java.util.*;
class Countd
{
    static int countd(int n)
    {
        int d,c=0;
        while(n>0)
        {
            c++;
            n/=10;
        }
        return c;
    }
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==0)
            System.out.println("InvaliD Input");
        else if(n<0)
        {
            n=-n;
            if(countd(n)==1)
                System.out.println("Given Number consists of only "+countd(n)+" Digit and it is Negative Value.");
            else
                System.out.println("Given Number consists of "+countd(n)+" Digits and it is Negative Value.");
        }
        else
        {
            if(countd(n)==1)
                System.out.println("Given Number consists of only "+countd(n)+" Digit.");
            else
                System.out.println("Given Number consists of "+countd(n)+" Digits.");
        }
    }
}
