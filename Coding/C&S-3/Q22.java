import java.util.*;
class Q22
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int s,e,i,c;
        s=sc.nextInt();
        e=sc.nextInt();
        if(s<=0 || e<=0)
            System.out.print("Invalid Inputs");
        else
        {
            c=0;
            for(i=s;i<=e;i+=100)
            {
                if(c==0)
                {
                    System.out.print(i);
                    c++;
                }
                else
                {
                    System.out.print(", "+i);
                }
            }
        }
    }
}
