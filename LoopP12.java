import java.util.*;
class LoopP12 //program to remove a digits from a number 
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("ENTER A NUMBER");
        int n=sc.nextInt();
        int r;
          System.out.println("THE DIGIT REMOVE FROM THE GIVEN NUMBER ARE");
        for(;n>0;)
        {
            r=n%10;
            n=n/10;
            System.out.println(r);
        }
    }
    
    
    
}