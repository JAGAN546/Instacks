import java.util.*;
class EEO
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<=0)
            System.out.println("Invalid Input");
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
