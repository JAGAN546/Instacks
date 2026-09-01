import java.util.Scanner;

class Apsr
{
    static void Apsr(int a,int d,int n)
    {
        int i;
        for(i=0;i<n;i++)
        {
            System.out.print(a+(i*d));
            if(i+1!=n)
                System.out.print(", ");
        }
        System.out.print(".");
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int a,d,n;
        a=sc.nextInt();
        d=sc.nextInt();
        n=sc.nextInt();
        if(n<=0)
            System.out.println("Invalid Input.");
        else
            Apsr(a,d,n);
    }
}