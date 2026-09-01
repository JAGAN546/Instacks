import java.util.Scanner;

class GCD
{
    static int GCD(int n1,int n2,int n3)
    {
        int i,l;
        l=n1<n2?n1<n3?n1:n3:n2<n3?n2:n3;
        for(i=l;i>0;i--)
        {
            if(n1%i==0 && n2%i==0 && n3%i==0)
                return i;
        }
        return 1;
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n1,n2,n3;
        n1=sc.nextInt();
        n2=sc.nextInt();
        n3=sc.nextInt();
        if(n1<=0 && n2<=0)
            System.out.println("Invalid Inputs");
        else if(n2<=0 && n3<=0)
            System.out.println("Invalid Inputs");
        else if(n3<=0 && n1<=0)
            System.out.println("Invalid Inputs");
        else if(n1<=0)
            System.out.println("Invalid First Input");
        else if(n2<=0)
            System.out.println("Invalid Second Input");
        else if(n3<=0)
            System.out.println("Invalid Third Input");
        else
            System.out.println(GCD(n1,n2,n3));
    }
}