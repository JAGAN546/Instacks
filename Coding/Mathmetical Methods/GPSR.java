import java.util.Scanner;

class GPSR
{
    static void gps(int a,int r,int n)
    {
        int i;
        for(i=1;i<=n;i++)
        {
            System.out.print(a*(int)Math.pow(r,i-1));
            if(i!=n)
                System.out.print(", ");
        }
        System.out.print(".");
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int a,r,n;
        a=sc.nextInt();
        r=sc.nextInt();
        n=sc.nextInt();
        if(n<=0)
            System.out.println("Invalid Input.");
        else
            gps(a,r,n);
    }
}