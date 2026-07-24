import java.util.Scanner;
class Factors
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,s;
        if(n<=0)
            System.out.println("Invalid Input");
        else
        {
            s=n/2;
            System.out.print(1+" ");
            for(i=2;i<=s;i++)
            {
                if(n%i==0)
                    System.out.print(i+" ");
            }
            System.out.print(n);
        }
        //Write your code here
    }
}
