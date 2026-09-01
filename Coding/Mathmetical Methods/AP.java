import java.util.Scanner;

class AP
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int a,d,n;
        a=sc.nextInt();
        d=sc.nextInt();
        n=sc.nextInt();
        if(n<=0)
            System.out.println("InValid Input.");
        else
        {
            System.out.println("Last term value is : "+(a+(n-1)*d)+".");
        }
    }
}