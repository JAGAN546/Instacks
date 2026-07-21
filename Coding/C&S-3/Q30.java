import java.util.*;
class Q30
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float s,e,i;
        s=sc.nextFloat();
        e=sc.nextFloat();
        for(i=s;i<=e;i+=0.2)
        {
            System.out.printf("%.1f^2",i);
            if(i+0.2<=e)
            {
                System.out.print(", ");
            }
        }
        System.out.print(".");
    }
}
