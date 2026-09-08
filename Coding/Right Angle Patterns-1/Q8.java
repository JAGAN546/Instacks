import java.util.*;
class Q8
{
    public static void main(String []args)
    {
        //Write Your Code Here
        Scanner sc=new Scanner(System.in);
        int i,j,n;
        n=sc.nextInt();
        if(n<=0)
            System.out.println("Invalid Input");
        else
        {
            for(i=n;i>=1;i--)
            {
                for(j=i;j>=1;j--)
                {
                    System.out.print(i*2+" ");
                }
                System.out.println();
            }
        }
    }
}