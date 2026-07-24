import java.util.Scanner;
class Main
{
    static void swap(int x,int y)
    {
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println(x);
        System.out.println(y);
    }
    public static void main(String []args)
    {
        //Write your code here
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        swap(a,b);
    }
}
