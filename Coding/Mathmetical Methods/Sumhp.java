import java.util.Scanner;

class Sumhp
{
    static float hp(int a,int d,int n)
    {
        int i,s;
        float sum=0;
        for(i=0;i<n;i++)
        {
            s=a+i*d;
            sum+=(float)1/s;
        }
        return sum;
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
            System.out.printf("%.2f",hp(a,d,n));
    }
}