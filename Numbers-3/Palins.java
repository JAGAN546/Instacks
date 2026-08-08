import java.util.*;
class Palins
{
       public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int e=sc.nextInt();
        if(s!=0 && e!=0){
            s=Math.abs(s);
            e=Math.abs(e);
            if(s>e){
                s+=e-(e=s);
            }
            int sum=0, c=0;
            for(int i=s+1; i<e; i++){
                int t=i;
                int r=0;
                while(t>0){
                    int d=t%10;
                    r=r*10+d;
                    t/=10;
                }
                if(r==i){
                    c++;
                    sum+=i;
                }
            }
            if(c>0)
                System.out.println(sum);
            else{
                System.out.println("No Palindrome Values");
            }
        }else{
            System.out.println("INVALID Inputs");
        }
    }
}
