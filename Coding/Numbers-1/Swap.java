import java.util.*;
class Swap
{
    static void swap(int a,int b)
    {
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a);
        System.out.println(b);
    }
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        swap(a,b);
    }
}
