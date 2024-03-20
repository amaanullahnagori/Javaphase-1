import java.util.*;
class LoopP15
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A NUMBER FOR ITS REVERSE");
        int n=sc.nextInt();
        int rev=0;
        int r;
        while(n>0)
        {
            r=n%10;
            n=n/10;
            rev=rev*10+r;
        }System.out.println("REVERSE OF A NUMBER IS :- \n"+rev);
    }
}