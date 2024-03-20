//to find how many digit the no. is 
import java.util.*;
class LoopP13
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("ENTER A NUMBER");
        int n=sc.nextInt();
        int r,c=0;
         // System.out.println("THE DIGIT REMOVE FROM THE GIVEN NUMBER ARE");
        for(;n>0;)
        {
            r=n%10;
            n=n/10;
            c++;
          //  System.out.println(r);
        }System.out.println("YOUR NUMBER CONTAIN "+c+" DIGIT");
    }
}