import java.util.*;
class Powerp
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n,p;
        n=sc.nextInt();
        p=sc.nextInt();
        if(n<=0 || p<=0)
        {
            System.out.println("Invalid Inputs");
            return;
        }
        int a=(int)Math.pow(n,p);
        System.out.println(n+" Power "+p+" value is "+a+".");
    }
}
