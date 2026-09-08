import java.util.*;
class Q5
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int i,j,n;
        n=sc.nextInt();
        if(n==0)
            System.out.println("Invalid Input");
        else
        {
            if(n<0)
                n=-n;
            for(i=n;i>=1;i--)
            {
                for(j=i;j>=1;j--)
                    System.out.print("@ ");
                System.out.println();
            }
        }
    }
}