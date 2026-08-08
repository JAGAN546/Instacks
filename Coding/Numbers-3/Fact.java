import java.util.*;
class Fact
{
    static int fact(int n)
    {
        int f=1,i;
        for(i=n;i>=1;i--)
        {
            f=f*i;
        }    
        return f;
    }
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        if(n<0)
            System.out.println("Invalid InPut");
        else
            System.out.println(fact(n));
    }
}
