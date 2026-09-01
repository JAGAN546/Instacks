import java.util.Scanner;

class GCD2
{
    static int GCD2(int n1,int n2)
    {
        int l,i;
        l=n1<n2?n1:n2;
        for(i=l;i>0;i--)
        {
            if(n1%i==0 && n2%i==0)
                return i;  
        }
        return 1;
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n1,n2;
        n1=sc.nextInt();
        n2=sc.nextInt();
        if(n1<=0 && n2<=0)
            System.out.println("Invalid Inputs");
        else if(n1<=0)
            System.out.println("Invalid First Input");
        else if(n2<=0)
            System.out.println("Invalid Second Input.");
        else
            System.out.println(GCD2(n1,n2));
    }
}