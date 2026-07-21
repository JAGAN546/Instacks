import java.util.Scanner;
class Q23
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int s,e,i;
        s=sc.nextInt();
        e=sc.nextInt();
        if(s<0 || e<0)
            System.out.println("Invalid Inputs");
        else
        {
            int c=0;
            for(i=s;i<=e;i+=2)
            {
                if(c==0)
                {
                    System.out.print(i+"^2");
                    c++;
                }
                else
                {
                    System.out.print(", "+i+"^2");
                }
            }
        }
    }
}