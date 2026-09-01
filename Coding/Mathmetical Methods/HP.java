import java.util.Scanner;

class HP
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int a,d,n;
        a=sc.nextInt();
        d=sc.nextInt();
        n=sc.nextInt();
        if(n<=0)
            System.out.println("InvaliD InPut");
        else
        {
            float s=a+(n-1)*d;
            System.out.printf("%.2f",(float)1/s);
        }
    }
}