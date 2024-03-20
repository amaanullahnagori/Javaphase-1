import java.util.*;
class LoopP14
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("ENTER A NUMBER TO CHECK WEATHER IT IS ARMSTRONG OR NOT");
        int n=sc.nextInt();
        int p=n;
        int sum=0;
        {
        while(n>0)
        {
            int r=n%10;
            n=n/10;
            sum=r*r*r+sum;
        }
        }
        if(p==sum)
        {
            System.out.println("THE NUMBER IS ARMSTRONG");
        }
         else 
        {
            System.out.println("THE NUMBER IS NOT A ARMSTRONG");
        }
    
    }
}