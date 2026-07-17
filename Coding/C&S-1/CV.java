import java.util.*;
class CV
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n,i;
        n=sc.nextInt();
        if(n<10 || n>100)
            System.out.println("Invalid Input");
        else
        {
        for(i=1;i<=n;i++)
            System.out.println("CVCORP");
        }
    }
}
