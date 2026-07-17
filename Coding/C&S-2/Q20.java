import java.util.*;
class Q20
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n,i,c=0;
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            if(c==0)
            {
                System.out.print("A,B");
                c++;
            }
            else
            {
                System.out.print(",A,B");
            }
        }
    }
}