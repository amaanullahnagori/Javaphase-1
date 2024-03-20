import java.util.*;
class LoopP4
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();                       /*254
                                                        r1 4 q1 25 r2 5 2
                                                                                      */
        int r1=n%10;
        int q1=n/10;
        int r2=q1%10;
         int q2=q1/10;
        System.out.println(q2);
        System.out.println(r2);
        System.out.println(r1);
        
    }
}