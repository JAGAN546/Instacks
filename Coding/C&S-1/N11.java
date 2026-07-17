import java.util.*;
class N11
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int s,e,i,c=0;
        s=sc.nextInt();
        e=sc.nextInt();
        if(s>e)
            System.out.println("INVALID RANGE");
        else
        {
            for(i=s;i<=e;i++)
            {
                if(i%11==0)
                {
                    System.out.print(i+" ");
                    c++;    
                }
            }
            if(c==0)
                System.out.println("NO NUMBERS");
        }
    }
}
