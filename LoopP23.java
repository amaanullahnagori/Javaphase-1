import java.util.*;
class LoopP23
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner (System.in);
        int store;
        int sum;
        do
        {  
        System.out.println("ENTER TWO NUMBER");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        sum=n1+n2;
        System.out.println("THE SUM OF TWO NUMBER IS "+sum);
        System.out.println("WANT TO CONTINUE? THEN PRESS (1) OTHERWISE YOU CAN PRESS");
        System.out.println ("ANY NUMBER TO EXIT ");
        store=sc.nextInt();
        
        }while(store==1);
    }
  
}