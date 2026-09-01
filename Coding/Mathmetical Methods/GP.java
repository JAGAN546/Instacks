import java.util.Scanner;

class GP
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int a,r,n;
        a=sc.nextInt();
        r=sc.nextInt();
        n=sc.nextInt();
        if(n<=0)
            System.out.println("InValid Input.");
        else
            System.out.println("Last term value is : "+a*(int)Math.pow(r,n-1)+".");
    }
}