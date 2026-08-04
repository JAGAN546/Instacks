import java.util.*;
class Altfibo
{
    static void fibo(int n)
    {
        int a=0,b=1,c=0,i,cd=0;
        for(i=1;i<=2*n;i++)
        {
            if(cd%2==0)
            {
                if(cd==0)
                    System.out.print(a);
                else
                    System.out.print(", "+a);
            }
            cd++;
            c=a+b;
            a=b;
            b=c;
        }
    }
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==0)
            System.out.println("Invalid Input");
        else
        {
            if(n<0)
                n=-n;
            fibo(n);
        }
    }
}
