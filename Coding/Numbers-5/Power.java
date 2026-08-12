import java.util.Scanner;
class Power
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n,p,i,r=1;
        n=sc.nextInt();
        p=sc.nextInt();
        if(n<=0 || p<=0)
        {
            System.out.println("Invalid Inputs");
            return;
        }
        for(i=1;i<=p;i++)
            r=r*n;
        System.out.println(n+" Power "+p+" value is "+r+".");
    }
}