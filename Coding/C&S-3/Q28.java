import java.util.*;
class Q28
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,n,c=0;
        n=sc.nextInt();
        for(i=1;i<=n;i++)
        {
            if(c==0)
            {
                System.out.print(i);
                c++;
            }
            else
            {
                if(i%3==0)
                    System.out.print(", factor of three");
                else
                    System.out.print(", "+i);
            }
        }
    }
}
