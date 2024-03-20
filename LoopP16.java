import java.util.*;
class LoopP16
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A NUMBER FOR ITS REVERSE");
        int n=sc.nextInt();
        int y=n;
        int rev=0;
        int r;
        while(n>0)
        {
            r=n%10;
            n=n/10;
            rev=rev*10+r;
        }
        if(y==rev)
        {
            System.out.println("THE NUMBER IS PALINDROM");
        }
        else 
        {
            System.out.println("IT IS NOT A PALINDROM");
        }
    }
}