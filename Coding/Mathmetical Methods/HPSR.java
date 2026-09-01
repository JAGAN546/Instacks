import java.util.Scanner;

class HPsr
{
    static void hpsr(int a,int d,int n)
    {
        int i,s=0;
        for(i=0;i<n;i++)
        {
            s=a+i*d;
            System.out.printf("%.2f",(1/(float)s));
            if(i+1!=n)
                System.out.print(", ");
        }
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int a,d,n;
        a=sc.nextInt();
        d=sc.nextInt();
        n=sc.nextInt();
        if(n<=0)
            System.out.println("Invalid Input");
        else
            hpsr(a,d,n);
    }
}