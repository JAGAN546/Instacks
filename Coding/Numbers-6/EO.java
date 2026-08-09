import java.util.*;
class EO
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,c=0;
        if(n<=0)
        {
            System.out.println("InvaliD InpuT");
            return;
        }
        else
        {
            while(n>0)
            {
                n=n-2;
            }
            if(n==-1)
                System.out.println("Odd");
            else
                System.out.println("Even");
        }
    }
}
