import java.util.*;
class LCM2
{
    static int lcm(int n1,int n2)
    {
        int l,i;
        l=n1>n2?n1:n2;
        for(i=l;;i++)
        {
            if(i%n1==0 && i%n2==0)
                return i;
        }
        //return n1*n2;
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n1,n2;
        n1=sc.nextInt();
        n2=sc.nextInt();
        if(n2<=0 && n1<=0)  
            System.out.println("Invalid Inputs.");
        else if(n1<=0)
            System.out.println("Invalid First Input");
        else if(n2<=0)  
            System.out.println("InValid Second Input");
        else
            System.out.println(lcm(n1,n2));
    }
}