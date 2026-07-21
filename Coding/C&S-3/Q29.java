import java.util.*;
class Q29
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int i,n,c=0;
        n=sc.nextInt();
        for(i=1;i<=n;i+=2)
        {
            if(c==0)
            {
                System.out.print(i);
                c++;
            }
            else
            {
                if(i%5==0)
                    System.out.print(", divisible by five");
                else
                    System.out.print(", "+i);
            }
        }
    }
}
