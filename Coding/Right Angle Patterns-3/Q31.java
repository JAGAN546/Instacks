import java.util.*;
class Q31
{
    public static void main(String []args)
    {
        //Write your code here
        Scanner sc=new Scanner(System.in);
        int i,j,n;
        n=sc.nextInt();
        if(n<=4)
            System.out.println("GiVen Value is Not More Than 4");
        else
        {
            for(i=1;i<=n;i++)
            {
                for(j=1;j<=i;j++)
                {
                    System.out.print(i*j+" ");
                }
                System.out.println();
            }
        }
    }
}