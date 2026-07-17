import java.util.Scanner;
class Main
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        if(a>b && a>c)
            System.out.println(a+" is a Biggest Number from the Given Numbers");
        else if(b>c)
            System.out.println(b+" is a Biggest Number from the Given Numbers");
        else
            System.out.println(c+" is a Biggest Number from the Given Numbers");
    }
} 
