import java.util.*;
class LoopP22 //reverse a number 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A NUMBER");
        int n=sc.nextInt();
        int remainder;
        int rev=0;
        while(n>0)
        {
           remainder=n%10;
           n=n/10;
            rev=10*rev+remainder;
          }System.out.println(rev);
    }
}