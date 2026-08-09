import java.util.*;
class Use
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==0)
            System.out.println("Invalid Input.");
        else
        {
            n=Math.abs(n);
            for(int i=n;i>=1;i--)
            {
                System.out.print(i*i*i);
                if(i!=1)
                    System.out.print(", ");
            }
            System.out.print(".");
        }
    }
}
