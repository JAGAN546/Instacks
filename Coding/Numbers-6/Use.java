import java.util.*;
class Use
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==0)
            System.out.println("Invalid Input");
        else
        {
            if(n<0)
                n=-n;
            int i,sum=0,p;
            for(i=n;i>=1;i--)
            {
                p=i*i;
                System.out.print(p);
                if(i!=1)
                    System.out.print(" + ");
                sum+=p;    
            }
            System.out.print(" = "+sum);
        }
    }
}
