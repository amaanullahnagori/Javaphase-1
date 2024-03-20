import java.util.*;
class LoopP9
{
    public static void main(String args[])
    {  
    Scanner sc=new Scanner(System.in);
        System.out.print("ENTER A NUMBER:-------- ");
    int n=sc.nextInt();
        System.out.println("EVEN NUMBER FROM "+n+" UPTO 0 ARE --->>");
        for(int i=n;i>=0;i--)
        {
            if (i%2==0)
            {
                System.out.println(i);
            }
        }
    }
}