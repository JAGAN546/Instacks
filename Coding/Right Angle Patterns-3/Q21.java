import java.util.*;
class Q21
{
    public static void main(String []args)
    {
        //Write your code here
        Scanner sc=new Scanner(System.in);
        int i,j,n,c=1;
        n=sc.nextInt();
        if(n<=0)
            System.out.println("Invalid Input");
        else
        {
            for(i=n;i>=1;i--)
            {
                for(j=i;j>=1;j--)
                {
                    if(c%2==1)
                        System.out.print("% ");
                    else
                        System.out.print("& ");
                }
                c++;
                System.out.println();
            }
        }
    }
}