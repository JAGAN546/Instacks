import java.util.Scanner;

class LCM
{
    static int lcm(int n1,int n2,int n3)
    {
        int h,i,m;
        h=n1>n2?n1>n3?n1:n3:n2>n3?n2:n3;
        //m=n1*n2*n3;
        for(i=h; ;i+=h)
        {
            if(i%n1==0 && i%n2==0 && i%n3==0)
            {
                return i;
            }
        }
        //return m;
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n1,n2,n3;
        n1=sc.nextInt();
        n2=sc.nextInt();
        n3=sc.nextInt();
        if(n1<=0 && n2<=0)
            System.out.println("Sorry Invalid Inputs!");
        else if(n2<=0 && n3<=0)
            System.out.println("Sorry Invalid Inputs!");
        else if(n3<=0 && n1<=0)
            System.out.println("Sorry Invalid Inputs!");
        else if(n1<=0 && n2<=0 && n3<=0)
            System.out.println("Sorry Invalid Inputs!");
        else if(n1<=0)
            System.out.println("InvalId First Input");
        else if(n2<=0)
            System.out.println("Invalid Second Input");
        else if(n3<=0)
            System.out.println("InvaliD ThirD Input");
        else
            System.out.println(lcm(n1,n2,n3));
    }
}