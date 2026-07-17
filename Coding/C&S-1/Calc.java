import java.util.*;
class Calc
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b;
        char c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.next().charAt(0);
        switch(c)
        {
            case '+':System.out.println(a+b);
                     break;
            case '-':System.out.println(a-b);
                     break;
            case '*':System.out.println(a*b);
                     break;
            case '/':System.out.println(a/b);
                     break;
            case '%':System.out.println(a%b);
                     break;
            default:System.out.println("Invalid Input");
        }
    }
}
