import java.util.*;
class Number
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        if(n<=100 || n>=1000)
            System.out.println("WRONG NUMBER");
        else if(n%2==0)
        {
            int r=n%3;
            System.out.println(r);
        }
        else
        {
            int r=n%2;
            System.out.println(r);
        }
    }
}