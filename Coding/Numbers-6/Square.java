import java.util.*;
class Square
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n,i;
        n=sc.nextInt();
        if(n<=0)
        {
            System.out.println("InvaliD Input");
            return;
        }
        else
        {
            for(i=1;i<=n;i++)
            {
                if(i*i==n)
                {
                    System.out.println("Given Number is a Perfect Square.");
                    // break;
                    return;
                }
            }
        }
        System.out.println("Given Number is Not a Perfect Square.");
    }
}
