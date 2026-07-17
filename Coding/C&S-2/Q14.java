import java.util.*;
class Q14
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int a,b,i,c=0;
        a=sc.nextInt();
        b=sc.nextInt();
        if(a<=0 || b<=0)
            System.out.println("Invalid Inputs");
        else
        {
            if(a%2==0)
            {
                for(i=a+2;i<b;i+=2)
                {   
                    if(i%2==0)
                    {
                        if(c%2==0)
                            System.out.print(i+" ");
                        c++;
                    }
                }
            }
            else
            {
                c=0;
                for(i=a;i<b;i++)
                {
                    if(i%2==0)
                    {
                        if(c%2==0)
                            System.out.print(i+" ");
                        c++;
                    }
                }
            }
        }
    }
}