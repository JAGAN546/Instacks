import java.util.*;
class Temperature
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        float f;
        n=sc.nextInt();
        f=(n*9/5f)+32;
        System.out.println(f+"F");
    }
}