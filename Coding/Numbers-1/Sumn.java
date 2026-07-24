import java.util.Scanner;
class Sumn
{
    
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,s=0,c=0;
        if(n==0)
            System.out.println("InvaLid Input.");
        else if(n<0)
            System.out.println("Sorry! you have Entered Negative Values.");
        else
        {
            System.out.print("Sum of 'N' Natural Numbers is ");
            for(i=1;i<=n;i++)
            {
                s=s+i;
                if(c==0)
                {
                    System.out.print(i);
                    c++;
                }
                else
                {
                    System.out.print(" + "+i);
                }
            }
            System.out.print(" = "+s+".");
        }
    }
}
