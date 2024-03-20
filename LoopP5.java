import java.util.*;
class LoopP5
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in)
                ;
        System.out.println("enter the no.");
        int cout=0;
        int n=sc.nextInt();
        while(n>0)
        {
             n=n/10;
             ++cout;                                                        
            // System.out.println(n);
        }
        System.out.println(cout);
    }
}