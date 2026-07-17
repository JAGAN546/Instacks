import java.util.*;
class CaseStudy
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        if(n>=0 && n<=100)
        {
            if(n>=0 && n<=35)
                System.out.println("DUMB");
            else if(n>=36 && n<=60)
                System.out.println("NO SMART");
            else if(n>=61 && n<=70)
                System.out.println("JUST SMART");
            else if(n>=71 && n<=80)
                System.out.println("SMART ENOUGH");
            else if(n>=81 && n<=90)
                System.out.println("SMART");
            else
                System.out.println("SUPER SMART");
        }
        else
            System.out.println("INVALID INPUT");
    }
}
