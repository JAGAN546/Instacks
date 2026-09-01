import java.util.Scanner;

class GPS
{
    static int gps(int a,int r,int n)
    {
        int i,s=0;//sum=0;
        for(i=0;i<n;i++)
            s=s+a*(int)Math.pow(r,i);
            //sum+=s;
        return s;
    }
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int a,r,n;
        a=sc.nextInt();
        r=sc.nextInt();
        n=sc.nextInt();
        if(n<=0)
            System.out.println("Invalid Input");
        else
            System.out.println(gps(a,r,n));
    }
}