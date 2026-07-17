import java.util.*;
class Q17
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        char c,i;
        // int i;
        c=sc.next().charAt(0);
        if(c=='a')
        {
            for(i='a';i<='z';i++)
                System.out.print(i+" ");
        }
        if(c=='A')
        {
            for(i='A';i<='Z';i++)
                System.out.print(i+" ");
        }
    }
}
